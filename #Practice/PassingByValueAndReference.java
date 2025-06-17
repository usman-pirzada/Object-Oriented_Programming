/*
In Java:
 - All object references are passed by value, but the value is a reference to the object.
    [This means if you pass an object (like SecureVault) to a method, the method receives a copy of the reference, but both point to the same object—so changes to the object's fields are visible outside the method.]

 * If you want to pass just the secret key (an int), you can pass it as a primitive type. Primitives in Java are always passed by value, so changes inside the method won't affect the original value.
*/

public class PassingByValueAndReference {
    public static void main(String[] args) {
        SecureVault vault = new SecureVault(42, "Admin@123");

        Hacker evil = new Hacker();
        evil.crack(vault);
        vault.reveal();
        }
}

class SecureVault {
    int secretKey;
    private String password;
    
    SecureVault(int key, String pwd) {
        this.secretKey = key;
        this.password = pwd;
    }
    
    void reveal() {
        System.out.println("Key: " + secretKey + " | Password: " + password);
    }
}


class Hacker {
    void crack(SecureVault vault) {
        vault.secretKey = 999;
        System.out.println("Cracked: " + vault.secretKey);
    }
}