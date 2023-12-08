package LabMid;

import java.util.ArrayList;

public class LabAllocator {
    private OSStrategy osStrategy;


    public LabAllocator(OSStrategy osStrategy) {
        this.osStrategy = osStrategy;
    }

    public ArrayList allocate() {
        return osStrategy.allocate();
    }
}
