class User {
    String name;
    int id;
    String email;
    String password;
    // List<> permissions;

    User(String name, int id, String email, String pass) {
this.name = name;
int id = id;
this.email;
this.password = generateHash(pass);
    }

    void authenticate() {

    }

    void authenticateAndPerformAction(User user,String action) {    // A function that performs the functionality based on the User roles and their permissions

    }

    void accessLab() {
        
    }

    void display() {

    }
}