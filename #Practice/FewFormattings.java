public class FewFormattings {
    public static void main(String[] args) {
        
        // %n is for new line in printf()

        double number = 12345.6789;
        System.out.printf("%e%n", number);    // Print as scientific notation

        int myInt = 25;
        float myFloat = 32.6f;
        System.out.printf("%-10s: %10d%n", "Left Align", myInt); // Left-align string, right-align integer
        System.out.printf("%-10s: %10.2f%n", "Pi Value", myFloat); // Left-align string, format float with 2 decimals

        System.out.printf("'%s'%n", "JaVa");    // %s will not capitalize or vise versa
        System.out.printf("'%S'%n", "jAvA");    // %S will capitalize all characters
        
        System.out.printf("simple integer: %d%n", 10000L);  // %d accepts all the integers available i.e: byte, short, int, long and Big Integer
        
    }
}
