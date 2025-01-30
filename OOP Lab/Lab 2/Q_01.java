import java.util.Scanner;

class Q_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[5];

        System.out.println("Input FIVE Integer values in the array:");
        for(int i=0; i < numArr.length; i++) {
            System.out.print("\nEnter value-" + (i+1) + ": ");
            numArr[i] = sc.nextInt();
        }

        int max = numArr[0];
        for(int num: numArr) {
            if(max < num) {
                max = num;
            }
        }

        System.out.println("The maximum number in the array is " + max);
    }
}