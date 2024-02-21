package devices;

public class MobileDevice {
    boolean isBluetoothOn;
    boolean isNFCOn;
    boolean isWiFiOn;
    boolean isDataTransmissionOn;
    public Device device;

    public MobileDevice(boolean isBluetoothOn, boolean isNFCOn, boolean isWiFiOn, boolean isDataTransmissionEnabled) {
        this.isBluetoothOn = isBluetoothOn;
        this.isNFCOn = isNFCOn;
        this.isWiFiOn = isWiFiOn;
        this.isDataTransmissionOn = isDataTransmissionEnabled;
    }

    public void mobileDeviceInfo() {
        this.device.allDeviceInfo();
        System.out.println("Informacje o urządzeniu mobilnym: " +
                "Is bluetooth on: " + this.isBluetoothOn + ", " +
                "Is NFC on: " + this.isNFCOn + ", " +
                "Is data transmission on: " + this.isDataTransmissionOn + ", " +
                "Is WiFi on: " + this.isWiFiOn);
    }

    public void enableBluetooth() {
        if (!this.isBluetoothOn) {
            this.isBluetoothOn = true;
            System.out.println("Bluetooth został włączony.");
        } else {
            System.out.println("Akcja nie została wykonana. Bluetooth był już włączony.");
        }
    }

    public void disableBluetooth() {
        if (this.isBluetoothOn) {
            this.isBluetoothOn = false;
            System.out.println("Bluetooth został wyłączony.");
        } else {
            System.out.println("Akcja nie została wykonana. Bluetooth był już wyłączony.");
        }
    }
}
