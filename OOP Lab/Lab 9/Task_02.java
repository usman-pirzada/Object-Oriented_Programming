abstract class Marks {
    double engMarks;
    double compMarks;
    double mathMarks;

    abstract void getPercentage();
}

class A extends Marks {

    A(double engMarks, double compMarks, double mathMarks) {
        this.engMarks = engMarks;
        this.compMarks = compMarks;
        this.mathMarks = mathMarks;
    }

    void getPercentage() {
        double percent = (engMarks + compMarks + mathMarks) / 3;
        System.out.printf("The percentage of Student A is: %.2f%% \n", percent);
    }
}

class B extends Marks {
    double urduMarks;

    B(double engMarks, double compMarks, double mathMarks, double urduMarks) {
        this.engMarks = engMarks;
        this.compMarks = compMarks;
        this.mathMarks = mathMarks;
        this.urduMarks = urduMarks;
    }

    void getPercentage() {
        double percent = (engMarks + compMarks + mathMarks + urduMarks) / 4;
        System.out.printf("The percentage of Student B is: %.2f%% \n", percent);
    }
}

public class Task_02 {
    public static void main(String[] args) {

        A a = new A(50, 30, 50);
        a.getPercentage();

        B b = new B(90, 70, 85, 46);
        b.getPercentage();
    }
}