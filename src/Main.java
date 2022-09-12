import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City(100, "Bishkek"));
        cities.add(new City(764, "Talas"));
        cities.add(new City(10245, "Cholpon-Ata"));
        cities.add(new City(245242, "Osh"));
        cities.add(new City(1048689, "Naryn"));

        Set<City> cityTreeSet = new TreeSet<>();

        for (City c: cities) {
            if (c.getCode()%2==1){
                cityTreeSet.add(c);
            }
        }

        for (City i : cityTreeSet) {
            System.out.println(i);
        }
    }
}