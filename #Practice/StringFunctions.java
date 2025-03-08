public class StringFunctions {
    public static void main(String[] args) {
        String address = "Jaddah, KSA";

        if(address.endsWith("KSA")) {
            System.out.println("You are living in Kingdom of Saudi Arabia");
        }

        if(address.contains("Jaddah")) {
            System.out.println("Your city is Jaddah");
        }

        double number = 12345.6789;
        System.out.printf("%e", number);    // Print as scientific notation

        System.out.println();

        int myInt = 25;
        float myFloat = 32.6f;
        System.out.printf("%-10s: %10d%n", "Left Align", myInt); // Left-align string, right-align integer
        System.out.printf("%-10s: %10.2f%n", "Pi Value", myFloat); // Left-align string, format float with 2 decimals

        
    }
}