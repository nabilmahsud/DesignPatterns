package proxy.ExamExample;

public class Main {
    public static void main(String[] args) {
        Person student = new Student();
        Person teacher = new Teacher();

        ExamProxy examProxy = new ExamProxy();

        examProxy.displayExam();

        examProxy.showResult(student);
        examProxy.showResult(teacher);
    }
}
