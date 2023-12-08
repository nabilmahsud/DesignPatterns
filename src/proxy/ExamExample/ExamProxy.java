package proxy.ExamExample;

public class ExamProxy implements IExam {
    private IExam realExam;
    Person person;

    @Override
    public void displayExam() {
        if (realExam == null) {
            realExam = new RealExam();
        }

        realExam.displayExam();
    }


    @Override
    public void showResult(Person person) {
        realExam.showResult(person);
    }

}
