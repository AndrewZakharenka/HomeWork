package HomeWork14102020.converter;

public class KelvinConverter implements Converter {

    @Override
    public void convert(double value) {
        System.out.println("Kelvin = " + (value + 273.15));
    }
}
