package lab6.iterator.tutorialpointexample;

public class Student {
    private String regNo;
    private String name;
    private int gender;
    private String phoneNumber;

    public Student(String regNo, String name, int gender, String phoneNumber) {
        this.regNo = regNo;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return "Reg No" + this.regNo + " Name: " + this.name + " Gender: " + this.gender + " Phone Number: " + this.phoneNumber;
    }
}
