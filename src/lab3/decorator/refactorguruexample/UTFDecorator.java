package lab3.decorator.refactorguruexample;


import java.nio.charset.StandardCharsets;

public class UTFDecorator extends DataSourceDecorator {
    UTFDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    public String encode(String data) {
        byte[] strBytes = data.getBytes(StandardCharsets.UTF_8);
        String utfEncodedString = new String(strBytes);
        return utfEncodedString;
    }

    public String decode(String data) {
//        Ambiguity about Java's default charset, so returning the same data.
//        Java default character system - UTF_16
//        byte[] strBytes = data.getBytes(StandardCharsets.UTF_16);
//        String utfEncodedString = new String(strBytes);
//        return utfEncodedString;
        return data;
    }
}
