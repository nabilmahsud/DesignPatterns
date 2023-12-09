package lab9.Composite;

import java.util.ArrayList;
import java.util.List;

public class HOD extends BaseCompositeEmployee {
    private String department;

    public HOD(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void giveBonus(int percentage) {
        int bonus = (( salary / 100 ) * percentage);
        System.out.println("Hello, my name is " + name + " and I am HOD! and I have " + subordinates.size()  + " subordinates and I got bonus: " + bonus);
    }

    @Override
    public void update() {
        System.out.println("HOD got notified!: " + name);
    }
}
