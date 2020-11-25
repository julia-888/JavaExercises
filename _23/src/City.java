import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class City {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Москва");
        cities.add("Воронеж");
        cities.add("Белгород");
        cities.add("Липецк");

        Map<String, ArrayList<String>> map = new HashMap();
        map.put("Россия", cities);

        ArrayList<String> cities2 = new ArrayList<>();
        cities2.add("София");
        cities2.add("Бургас");
        cities2.add("Дмитровград");
        cities2.add("Пловдив");

        map.put("Болгария", cities2);

        System.out.println(map.toString());
    }
}
