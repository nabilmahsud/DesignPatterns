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
        String utfEncoded = "";
        byte[] utf = data.getBytes(StandardCharsets.UTF_8);
        for (var i = 0; i < utf.length; i++)
            utfEncoded += utf[i];

        return utfEncoded;
    }

    public String decode(String data) {
        String utfEncoded = "";
        byte[] utf = data.getBytes(StandardCharsets.UTF_8);
        for (var i = 0; i < utf.length; i++)
            utfEncoded += utf[i];

        return new String(utfEncoded);
    }
}