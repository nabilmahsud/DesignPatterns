package decorator.refactorguruexample;

public interface DataSource {
    void writeData(String data);

    String readData();
}
