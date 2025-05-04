// Method Overloading
class Registeration {
    void register(String name, short comp_category) {
        System.out.println("Single participant's registration successful!");
    }
    void register(String teamName, int no_of_members, short comp_category) {
        System.out.println("Team registration successful!");
    }

    void register(String universityName, int tot_participants) {
        System.out.println("University-wide bulk registration successful!");
    }

    void register(String name, String company, String expertise) {
        System.out.println("Industry expert’s registration successful!");
    }

    void register(String name, String designation) {
        System.out.println("VIP guest registration successful!");
    }
}

public class Q_04 {
    public static void main(String[] args) {
        Registeration reg = new Registeration();

        reg.register("Hammad", (short) 2);
        reg.register("CodeTech", 5, (short) 2);
        reg.register("FAST University", 7);
        reg.register("Abdullah", "SoftTech", "Software Developer");
        reg.register("Abdul Rehman", "CEO");
    }
}
