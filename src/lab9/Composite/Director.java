package lab9.Composite;

import java.util.ArrayList;
import java.util.List;

public class Director extends BaseCompositeEmployee {
    private String department;

    public Director(String name, int salary) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void giveBonus(int percentage) {
        int bonus = (( salary / 100 ) * percentage);
        System.out.println("Hello, my name is " + name + " and I am Director! and I have " + subordinates.size()  + " subordinates and I got bonus: " + bonus);
    }
<<<<<<< HEAD
<<<<<<< HEAD

    @Override
    public void update() {
        System.out.println("Director got notified!: " + name);
    }
=======
>>>>>>> main
=======
>>>>>>> main
}
