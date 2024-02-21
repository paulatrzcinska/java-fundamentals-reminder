package devices;

public class HardwareData {
    String processor;
    int randomAccessMemory;
    int discSpace;

    public HardwareData(String processor, int randomAccessMemory, int discSpace) {
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        this.discSpace = discSpace;
    }

    public void hardwareInfo() {
        System.out.println("Informacje o parametrach urządzenia: " +
                "Procesor: " + this.processor + ", " +
                "RAM: " + this.randomAccessMemory + ", " +
                "Miejsce na dysku: " + this.discSpace);
    }
}
