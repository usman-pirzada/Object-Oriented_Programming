package Q_05;

public class Device {
    int deviceID;
    String deviceType;
    float powerConsumption;
    String deviceStatus;

    Device() {
        this.deviceID = 0000;
        this.deviceType = "Unknown";
        this.powerConsumption = 0;
        this.deviceStatus = "OFF";
    }

    Device(int deviceID, String deviceType, float powerConsumption, String deviceStatus) {
        this.deviceID = deviceID;
        this.deviceType = deviceType;
        this.powerConsumption = powerConsumption;
        this.deviceStatus = deviceStatus;
    }

    @Override
    public String toString() {
        return " Device ID: " + deviceID + " | Type: " + deviceType + " | Power Consumption: " + powerConsumption + "W | Status: " + deviceStatus;
    }

    @Override
    protected void finalize() {
        System.out.println("Device record deleted: " + this.deviceID);
    }

    String toStringDefaultDevice() {
        return " Device ID: " + deviceID + "\n Type: " + deviceType + "\n Power Consumption: " + powerConsumption + "W\n Status: " + deviceStatus;
    }
}
