/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite_tutorialspoint;

/**
 *
 * @author FA20-BSE-009
 */
public class DOO extends BaseEmployee {
    private String rank;

    public DOO(String name, int salary, String rank) {
        super(name, salary);
        this.rank = rank;
    }

    @Override
    public void giveBonus(int percentage) {
         int bonus = (( salary / 100 ) * percentage);
         System.out.println("Hello, my name is " + name + " and I am DOO with rank" + rank + " and I got bonus: " + bonus);
    }
    
}
