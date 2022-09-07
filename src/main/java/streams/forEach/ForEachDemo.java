package streams.forEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("Adekunle maxt");
        names.add("Kola");
        names.add("Bash");
        names.add("Caleb");
        names.add("Benjamin");
        names.add("Pauline");
        names.add("Raquel");
        names.add("Rita");
        names.add("Diana");
        names.add("Morales");

        //how to iterate in the traditional pattern

        for (String i : names){
            System.out.println(i);
        }

        //using streams
        System.out.println("\n using  Streams \n");
        names.stream().filter(name -> name.toLowerCase().contains("d")).forEach(System.out::println);
        names.stream().filter(name -> name.toLowerCase().startsWith("r")).forEach(System.out::println);

        Map<String, Integer> itemPrices = new HashMap<>();

        itemPrices.put("Soap",300);
        itemPrices.put("Soda",200);
        itemPrices.put("rice",900);
        itemPrices.put("Banana",500);
        itemPrices.put("Apples",100);
        itemPrices.put("Cereal",560);
        itemPrices.put("Beans",780);
        itemPrices.put("Television",630);
        itemPrices.put("Tomatoes",400);
        itemPrices.put("Wine",870);

       // System.out.println(itemPrices);

//        itemPrices.forEach((key,value) -> System.out.println(itemPrices.entrySet().stream().toList()));
//        System.out.println(itemPrices.entrySet().stream().filter(e -> e.getValue() > 200).sorted().toList());
        itemPrices.forEach((s, integer) -> System.out.println(s + "cost : N"+integer));



    }
}
