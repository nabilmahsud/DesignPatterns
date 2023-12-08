package proxy.ExamExample;

public class RealExam implements IExam {
    Person person;

    public RealExam() {
        loadExam();
    }

    @Override
    public void displayExam() {
        System.out.println("Displaying Exam");
    }


    public void loadExam() {
        System.out.println("Loading exam!");
    }


    @Override
    public void showResult(Person person) {
        person.showResult();
    }
}
