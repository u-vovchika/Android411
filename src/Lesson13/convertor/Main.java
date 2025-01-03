package Lesson13.convertor;

public class Main {
    public static void main(String[] args) {
        double temperature = 21.5;
        final int N = 3;
        Converter converter[] = new Converter[N];
        converter[0] = new CelsiusConverter();
        converter[1] = new KelvinConvertor();
        converter[2] = new FahrenheitConvertor();
        
        for (Converter c : converter) {
            System.out.println("t = " + c.getConverterValue(temperature));
        }
    }
}

interface Converter {
    double getConverterValue(double baseValue);
}

class CelsiusConverter implements Converter {
    @Override
    public double getConverterValue(double baseValue) {
        return baseValue;
    }
}

class KelvinConvertor implements Converter {
    @Override
    public double getConverterValue(double baseValue) {
        return baseValue + 273.15;
    }
}

class FahrenheitConvertor implements Converter {
    @Override
    public double getConverterValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
