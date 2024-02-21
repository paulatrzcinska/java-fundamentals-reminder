package devices;

public class Device {
    String name;
    String serialNumber;
    int yearOfManufacture;
    public Software software;
    public Battery battery;
    public HardwareData hardwareData;

    public Device(String name, String serialNumber, int yearOfManufacture) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void allDeviceInfo() {
        System.out.println("Informacje o urządzeniu " + this.name + ":");
        this.software.softwareInfo();
        this.battery.batteryInfo();
        this.hardwareData.hardwareInfo();
    }
}
