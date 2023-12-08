package LabMid;

public class Student {
    private String name;
    private int reg;
    private String description;
    private int semester;
    private Computer allocatedComputer;

    public Student(String name, int reg, String description, int semester) {
        this.name = name;
        this.reg = reg;
        this.description = description;
        this.semester = semester;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public int getReg() {
        return reg;
    }

    public void setAllocatedComputer(Computer allocatedComputer) {
        this.allocatedComputer = allocatedComputer;
    }

    public Computer getAllocatedComputer() {
        return allocatedComputer;
    }
}
