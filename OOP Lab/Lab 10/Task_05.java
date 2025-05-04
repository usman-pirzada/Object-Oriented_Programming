import java.util.Scanner;

class TooManyOversException extends Exception {

    TooManyOversException(String msg) throws TooManyOversException {
        throw new TooManyOversException(msg);
    }
}

public class Task_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int over = 0;
        String score;

        while (true) {
            
        }
    }
}
