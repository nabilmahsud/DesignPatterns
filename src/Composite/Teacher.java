package composite_tutorialspoint;

public class Teacher extends BaseEmployee {
    private String qualification;
    private String status;
    
    public Teacher(String name, int salary, String qualification, String status) {
        super(name, salary);
        this.qualification = qualification;
        this.status = status;
    }

    @Override
    public void giveBonus(int percentage) {
        // Teacher bonus calculations
        int bonus = (( salary / 100 ) * percentage);
        System.out.println("Hello, my name is " + name + " and I am a teacher! and I got bonus: " + bonus);
    }
}
