package lab9.Composite;

public class EmployeeController {
    private IEmployee employee;

    public EmployeeController(IEmployee employee) {
        this.employee = employee;
    }

    // generating organogram and bonus in the same method
    public void generateOrganogram(int percentage) {
        employee.giveBonus(10);
    }
}
