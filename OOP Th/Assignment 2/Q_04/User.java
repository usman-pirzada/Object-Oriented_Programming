package Q_04;

import java.util.ArrayList;
import java.util.Scanner;

class User {
    protected String name;
    protected int id;
    private String email;
    private int password;
    protected ArrayList<String> permissions;

    User(String name, int id, String email, String pass) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = generatePassHash(pass);
        this.permissions = new ArrayList<>();
    }

    User(String name, int id, String email, String pass, ArrayList<String> permissions) {
        this(name, id, email, pass);
        this.permissions = new ArrayList<>(permissions);
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String pass) {
        this.password = generatePassHash(pass);
    }

    private int generatePassHash(String pass) {
        int hash = 5381;
        for (char c : pass.toCharArray()) {
            hash = ((hash << 5) + hash) + c;
        }
        return hash;
    }

    boolean authenticate(String pass) {
        if(this.password == generatePassHash(pass)) {
            return true;
        }

        return false;
    }

    static void authenticateAndPerformAction(User user,String action) {    // A function that performs the functionality based on the User roles and their permissions
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        if(user.authenticate(sc.next())) {

            switch (user) {
                case Professor prof -> {
                    for (String permit : prof.permissions) {
                        if (action.equalsIgnoreCase(permit)) {
                            System.out.println("The Prof. " + prof.name + " (ID: " + prof.id + ") have been permitted to " + action);
                        } else {
                            System.out.println("The professor can't " + action);
                        }
                    }
                }

                case TA ta -> {
                    for (String permit : ta.permissions) {
                        if (action.equalsIgnoreCase(permit)) {
                            System.out.println("The TA " + ta.name + " (ID: " + ta.id + ") have been permitted to " + action);
                        } else {
                            System.out.println("The TA can't " + action);
                        }
                    }
                }

                case Student st -> {
                    for (String permit : st.permissions) {
                        if (action.equalsIgnoreCase(permit)) {
                            System.out.println("The student " + st.name + " (ID: " + st.id + ") have been permitted to " + action);
                        } else {
                            System.out.println("The student can't " + action);
                        }
                    }
                }

                default -> System.out.println("Invalid user type");
            }



        } else {
            System.out.println("Invalid Password entered!");
        }
    }

    void accessLab() {
        authenticateAndPerformAction(this, "Access Lab");
    }

    void display() {
        System.out.println("Name: " + this.name + " (ID: " + this.id + ")");
        System.out.println("Email: " + this.email);
        System.out.println("Permissions:");
        for(String permission : permissions) {
            System.out.println(" - " + permission);
        }
    }
}