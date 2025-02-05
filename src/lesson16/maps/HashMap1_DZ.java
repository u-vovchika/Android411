package lesson16.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMap1_DZ {
    public static void main(String[] args) {
        String[] colorsArray = {"red", "orange", "aqua", "pink", "gray",
                "blue", "white", "black", "yellow", "broun"};
        HashMap<String, Color> colorMap = new HashMap<>();
        colorMap.put(colorsArray[0], new Color(1, "red"));
        colorMap.put(colorsArray[1], new Color(2, "orange"));
        colorMap.put(colorsArray[2], new Color(3, "aqua"));
        colorMap.put(colorsArray[3], new Color(4, "pink"));
        colorMap.put(colorsArray[4], new Color(5, "gray"));
        colorMap.put(colorsArray[5], new Color(6, "blue"));
        colorMap.put(colorsArray[6], new Color(7, "white"));
        colorMap.put(colorsArray[7], new Color(8, "black"));
        colorMap.put(colorsArray[8], new Color(9, "yellow"));
        colorMap.put(colorsArray[9], new Color(10, "broun"));
        int count = 1;
        for (Map.Entry<String, Color> entry : colorMap.entrySet()) {
            System.out.println(count + ") " + entry.getKey() + ": " + entry.getValue());
            count++;
        }
        // System.out.println("1) "+ colorMap);
    }
}

class Color {
    String name;
    int index;

    public Color(int index, String name) {
        this.index = index;
        this.name = name;
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}