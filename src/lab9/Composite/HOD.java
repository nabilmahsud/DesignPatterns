/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite_tutorialspoint;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FA20-BSE-009
 */
public class HOD extends BaseEmployee {
    private String department;
    private List<IEmployee> subordinates = new ArrayList<>();
    

    public HOD(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }
    
    public void addEmployee(IEmployee e) {
        subordinates.add(e);
    }
    
    public void removeEmployee(IEmployee e) {
        subordinates.remove(e);
    }
    

    @Override
    public void giveBonus(int percentage) {
        int bonus = (( salary / 100 ) * percentage);
        System.out.println("Hello, my name is " + name + " and I am HOD! and I have " + subordinates.size()  + " subordinates and I got bonus: " + bonus);
        for (IEmployee subordinate : subordinates)
            subordinate.giveBonus(percentage);
    }
    
}
