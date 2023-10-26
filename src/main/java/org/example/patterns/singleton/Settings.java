package org.example.patterns.singleton;

public class Settings {

    private static Settings instance;

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }

        return instance;
    }

    private Settings() {

    }

    private String param1;
    private String param2;
    private boolean param3;

    public String getParam1() {
        return param1;
    }

    public String getParam2() {
        return param2;
    }

    public boolean isParam3() {
        return param3;
    }

}
