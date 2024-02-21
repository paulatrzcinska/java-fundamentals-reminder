package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Device device1;
        device1 = new Device("iphone15 pro max", "KN7654", 2023);
        device1.battery = new Battery(80, true, 95);
        device1.hardwareData = new HardwareData("Radeon", 8, 256);
        device1.software = new Software("iOS", "16.1", new String[]{"Chrome", "Safari"});

        MobileDevice device2;
        device2 = new MobileDevice(false, true, true, false);
        device2.device = new Device("samsung s30", "mkm100023", 2020);
        device2.device.battery = new Battery(10, false, 70);
        device2.device.hardwareData = new HardwareData("Radeon", 8, 256);
        device2.device.software = new Software("Android", "16.1", new String[]{"Chrome"});

        device1.allDeviceInfo();
        device2.mobileDeviceInfo();

        device2.enableBluetooth();
        device2.mobileDeviceInfo();

        device2.enableBluetooth();
        device2.mobileDeviceInfo();

        device2.disableBluetooth();
        device2.mobileDeviceInfo();
    }
}