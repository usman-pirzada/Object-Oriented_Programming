package Q_08;

class Main {
    public static void main(String[] args) {

        Manager m1 = new Manager();
        System.out.println(m1);

        Manager m2 = new Manager("Ahmed Ali", 102, "General");
        System.out.println(m2);

        Manager m3 = new Manager("Sara Khan", 103, "HR");
        System.out.println(m3);

        Manager m4 = new Manager("Zain Malik", 201, "IT");
        System.out.println(m4);

        Manager m5 = new Manager("Ahmed Ali", 102, "General", 5);
        System.out.println(m5.printTeamSize());
    }
}