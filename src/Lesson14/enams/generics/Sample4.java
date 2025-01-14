package Lesson14.enams.generics;

public class Sample4 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Average<Integer> integerAverage = new Average<>(intArray);
        System.out.println(integerAverage.average());

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Average<Double> doubleAverage = new Average<>(doubleArray);
        System.out.println(doubleAverage.average());

    }
}

class Average<T extends Number>{
    private T[] array;

    public Average(T[] array) {
        this.array = array;
    }

    public  double average(){
        double sum = 0;
//        for (T value : array){
//            sum +=  value.doubleValue();
//        }
        for (int i = 0; i < array.length; i++) {
            sum +=  array[i].doubleValue();

        }
        return sum / array.length;

    }
}