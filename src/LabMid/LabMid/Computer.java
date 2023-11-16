package LabMid;

public class Computer {
    private String computerId;
    private String OS;
    private String tools;

    public Computer(String computerId, String os, String tools) {
        this.computerId = computerId;
        OS = os;
        this.tools = tools;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
}
