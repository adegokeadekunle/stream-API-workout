package streams.sort;

import java.util.*;

public class SortingMaps2Demo {

    public static void main(String[] args) {

        // IMPORTANT NOTE
        // map can be made a list and the keys and values can be accessed as displayed below.

        List<Map.Entry<String,Integer>> entries = new ArrayList();

        entries.add(new AbstractMap.SimpleEntry<String,Integer>("Butter",1000));
        entries.add(new AbstractMap.SimpleEntry<String,Integer>("Meat",15000));
        entries.add(new AbstractMap.SimpleEntry<String,Integer>("Drinks",11000));
        entries.add(new AbstractMap.SimpleEntry<String,Integer>("Rice",39000));
        entries.add(new AbstractMap.SimpleEntry<String,Integer>("Tomatoes",6000));
        entries.add(new AbstractMap.SimpleEntry<String,Integer>("Oil",8000));
        entries.add(new AbstractMap.SimpleEntry<String,Integer>("Chicken",17000));
        entries.add(new AbstractMap.SimpleEntry<String,Integer>("Garri",10000));
        entries.add(new AbstractMap.SimpleEntry<String,Integer>("Bread",700));
        entries.add(new AbstractMap.SimpleEntry<String,Integer>("Yam",3000));
        entries.add(new AbstractMap.SimpleEntry<String,Integer>("Beans",4000));

        System.out.println(entries);

        System.out.println(entries.stream().sorted(Comparator.comparing(e -> e.getKey())).toList());


    }
}
