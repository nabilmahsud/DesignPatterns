package lab9.Composite;

public abstract class BaseEmployee implements IEmployee, Observer {
    protected String name;
    protected int salary;
    
    BaseEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
