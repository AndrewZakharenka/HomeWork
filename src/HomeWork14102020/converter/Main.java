package HomeWork14102020.converter;

public class Main {
    public static void main(String[] args) {
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        KelvinConverter kelvinConverter = new KelvinConverter();

        celsiusConverter.convert(18.0);
        fahrenheitConverter.convert(18);
        kelvinConverter.convert(18.0);
    }
}
