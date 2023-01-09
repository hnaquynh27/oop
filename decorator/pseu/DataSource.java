package decorator.pseu;

public interface DataSource {
    void writeData(String data);

    String readData();
}