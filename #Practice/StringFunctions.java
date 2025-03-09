public class StringFunctions {
    public static void main(String[] args) {
        String address = "Jaddah, KSA";

        if(address.endsWith("KSA")) {
            System.out.println("You are living in Kingdom of Saudi Arabia");
        }

        if(address.contains("Jaddah")) {
            System.out.println("Your city is Jaddah");
        }

    }
}