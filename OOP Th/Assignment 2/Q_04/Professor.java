package Q_04;

import java.util.ArrayList;

class Professor extends User {

    Professor(String name, int id, String email, String pass) {
        super(name, id, email, pass);
    }

    Professor(String name, int id, String email, String pass, ArrayList<String> permissions) {
        super(name, id, email, pass);
        permissions = new ArrayList<>(permissions);
    }

    void assignProjects() {

    }

    @Override
    void display() {
        System.out.print("Professor ");
        super.display();
    }
}