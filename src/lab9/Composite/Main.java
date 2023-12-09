package lab9.Composite;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("nabil", 100, "phd", "active");
        Teacher teacher2 = new Teacher("zeeshan", 200, "bsc", "active");
        DOO doo1 = new DOO("adil", 100, "high");
        DOO doo2 = new DOO("usama", 200, "low");

        Director director = new Director("ali", 300);

        HOD hod1 = new HOD("ishaq", 100, "cs");
        HOD hod2 = new HOD("mazhar", 100, "bba");


        hod1.addEmployee(teacher1);
        hod1.addEmployee(doo1);

        hod2.addEmployee(teacher2);
        hod2.addEmployee(doo2);

        director.addEmployee(hod1);
        director.addEmployee(hod2);

        director.giveBonus(10);




    }
}
