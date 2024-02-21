package org.example;

import java.util.Arrays;

public class Software {
    String operationSystem;
    String operationSystemVersion;
    String[] browsers;

    public Software(String operationSystem, String operationSystemVersion, String[] browsers) {
        this.operationSystem = operationSystem;
        this.operationSystemVersion = operationSystemVersion;
        this.browsers = browsers;
    }

    public void softwareInfo() {
        System.out.println("Informacje o oprogramowaniu: " +
                "System operacyjny: " + this.operationSystem + ", " +
                "Wersja systemu operacyjnego: " + this.operationSystemVersion + ", " +
                "Dostępne przeglądarki: " + Arrays.toString(this.browsers));
    }
}
