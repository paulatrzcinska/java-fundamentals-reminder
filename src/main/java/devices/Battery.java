package devices;

public class Battery {
    int batteryLevel;
    boolean isBatteryInCharge;
    int batteryCondition;

    public Battery(int batteryLevel, boolean isBatteryInCharge, int batteryCondition) {
        this.batteryLevel = batteryLevel;
        this.isBatteryInCharge = isBatteryInCharge;
        this.batteryCondition = batteryCondition;
    }

    public void batteryInfo() {
        System.out.println("Informacje o baterii: " +
                "Poziom baterii: " + this.batteryLevel + "%" + ", " +
                "Czy bateria jest w trakcie ładowania: " + this.isBatteryInCharge + ", " +
                "Kondycja baterii: " + this.batteryCondition);
    }
}
