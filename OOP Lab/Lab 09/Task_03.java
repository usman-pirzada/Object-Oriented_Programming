abstract class Character {
    String name;
    int healthLevel;
    int attackPower;

    abstract void specialAbility();

    void attack(Character c) {
        this.healthLevel -= c.attackPower;
    }

    void defend(Character c) {
        this.healthLevel += c.attackPower;
    }
}

class Warrior extends Character {

    Warrior(String name, int healthLevel, int attackPower) {
        this.name = name;
        this.healthLevel = healthLevel;
        this.attackPower = attackPower;
    }

    void specialAbility() {
        this.attackPower *= 2;
        System.out.println("The attacking power of " + this.name + " (Warrior) has been doubled.");
    }
}

class Mage extends Character {

    Mage(String name, int healthLevel, int attackPower) {
        this.name = name;
        this.healthLevel = healthLevel;
        this.attackPower = attackPower;
    }

    void specialAbility() {
        this.attackPower += 20;
        System.out.println("The attacking power of " + this.name + " (Mage) has been increased by 20.");
    }
}

class Archer extends Character {

    Archer(String name, int healthLevel, int attackPower) {
        this.name = name;
        this.healthLevel = healthLevel;
        this.attackPower = attackPower;
    }

    void specialAbility() {
        this.attackPower += 15;
        System.out.println("The attacking power of " + this.name + " (Archer) has been increased by 15.");
    }
}

public class Task_03 {
    public static void main(String[] args) {

    }
}