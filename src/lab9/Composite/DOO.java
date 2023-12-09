package lab9.Composite;
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
