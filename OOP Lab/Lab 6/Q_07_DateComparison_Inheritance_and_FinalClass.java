import java.util.Scanner;

class Software {
    String softwareName;
    String version;
    String licenseKey;

    Software(String softwareName, String version, String licenseKey) {
        this.softwareName = softwareName;
        this.version = version;
        this.licenseKey = licenseKey;
    }

    void displayDetails() {
        System.out.println("Software Name: " + softwareName);
        System.out.println("Version: " + version);
        System.out.println("License Key: " + licenseKey);
    }
}

class LicensedSoftware extends Software {
    String expiryDate;

    LicensedSoftware(String softwareName, String version, String licenseKey, String expiryDate) {
        super(softwareName, version, licenseKey);
        this.expiryDate = expiryDate;
    }

    boolean isLicenseExpired(String currentDate) {
        // Date comparing logic
        String expiryNum = expiryDate.replace("-", "");
        String currentNum = currentDate.replace("-", "");
        int expiryInt = Integer.parseInt(expiryNum);
        int currentInt = Integer.parseInt(currentNum);
        return currentInt > expiryInt;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("License Expiry Date: " + expiryDate);
    }
}

class CloudSoftware extends LicensedSoftware {
    private int storageLimit = 100; // Hardcoded storage limit in GB
    private int usedStorage; // in GB

    CloudSoftware(String softwareName, String version, String licenseKey, String expiryDate, int usedStorage) {
        super(softwareName, version, licenseKey, expiryDate);
        this.usedStorage = usedStorage;
    }

    double calculateRemainingStoragePercentage() {
        return ((double) (storageLimit - usedStorage) / storageLimit) * 100;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Storage Limit: " + storageLimit + " GB");
        System.out.println("Used Storage: " + usedStorage + " GB");
        System.out.println("Remaining Storage Percentage: " + calculateRemainingStoragePercentage() + "%");
    }
}

public class Q_07_DateComparison_Inheritance_and_FinalClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Software Name: ");
        String softwareName = scanner.nextLine();

        System.out.print("Enter Version: ");
        String version = scanner.nextLine();

        System.out.print("Enter License Key: ");
        String licenseKey = scanner.nextLine();

        System.out.print("Enter License Expiry Date (yyyy-MM-dd): ");
        String expiryDate = scanner.nextLine();

        System.out.print("Enter Current Date (yyyy-MM-dd): ");
        String currentDate = scanner.nextLine();

        System.out.print("Enter Size of Software (GB): ");
        int usedStorage = scanner.nextInt();

        CloudSoftware cloudSoftware = new CloudSoftware(softwareName, version, licenseKey, expiryDate, usedStorage);
        System.out.println("\nSoftware Details:");
        cloudSoftware.displayDetails();
        System.out.println("License Status: " + (cloudSoftware.isLicenseExpired(currentDate) ? "Expired" : "Valid"));

    }
}