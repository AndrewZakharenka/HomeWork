package HomeWork14102020.converter;

public class FahrenheitConverter implements Converter {

    @Override
    public void convert(double value) {
        System.out.println("Fahrengeit = " + (value * 1.8 + 32));
    }
}
