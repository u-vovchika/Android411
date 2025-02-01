package lesson16.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class List3 {
    public static void main(String[] args) {
        compareLists();
    }

    public static void compareLists(){
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int M = 1000;
        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }

        long startTime = System.currentTimeMillis();
        //System.out.println(startTime);

        for (int i = 0; i < M; i++) {
            //arrayList.get((int)(Math.random() * (N - 1)));
            arrayList.remove(i);

        }
        System.out.println(System.currentTimeMillis() - startTime);


        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            //linkedList.get((int)(Math.random() * (N - 1)));
            linkedList.remove(i);

        }
        System.out.println(System.currentTimeMillis() - startTime);


    }


}
