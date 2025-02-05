package lesson16.sities;

public class City implements Comparable<City>{
    private String name;
    private int codeCity;

    public City(String name, int codeCity) {
        this.name = name;
        this.codeCity = codeCity;
    }

    public String getName() {
        return name;
    }

    public int getCodeCity() {
        return codeCity;
    }

    @Override
    public String toString() {
        return "name: '" + name + '\'' +
                "; code: " + codeCity +
                ';';
    }

    @Override
    public int compareTo(City o) {
        return o != null ? name.compareTo(o.getName()) : 0;
    }
}
