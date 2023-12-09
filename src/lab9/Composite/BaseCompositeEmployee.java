package lab9.Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseCompositeEmployee extends BaseEmployee {
    protected List<IEmployee> subordinates = new ArrayList<>();

    BaseCompositeEmployee(String name, int salary) {
        super(name, salary);
    }

    public void addEmployee(IEmployee e) {
        subordinates.add(e);
    }

    public void removeEmployee(IEmployee e) {
        subordinates.remove(e);
    }

    public void giveBonusTask(int percentage) {
        giveBonus(percentage);
        giveBonusRecursively(percentage);
    }


    public abstract void giveBonus(int percentage);

    public void giveBonusRecursively(int percentage) {
        for (IEmployee subordinate : subordinates)
            subordinate.giveBonus(percentage);
    }
}
