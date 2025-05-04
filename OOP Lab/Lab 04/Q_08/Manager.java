package Q_08;

class Manager extends Employee{
    int teamSize;

    Manager() {
        super();
    }

    Manager(String name, int id, String department) {
        super("Ahmed Ali", 102, "General");
    }

    Manager(String name, int id, String department, int teamSize) {
        super("Ahmed Ali", 102, "General");

        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return this.name + " (ID: " + this.id + "), Department: " + this.department;
    }

    String printTeamSize() {
        return this.name + " manages a team of " + this.teamSize + " members.";
    }
}