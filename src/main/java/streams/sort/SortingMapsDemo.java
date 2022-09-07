package streams.sort;

import java.util.*;
import java.util.Map.Entry;

public class SortingMapsDemo {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);

        //to use Collections.sort() you need to make the map to a list then you can sort it based on key or value

        List<Entry<String,Integer>> entries = new ArrayList(map.entrySet());

        //sorting is done using the key. in this case a string with first letter used to sort based on order
//        Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
//            @Override
//            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//                return o2.getKey().compareTo(o1.getKey());   //descending
//             //   return o1.getKey().compareTo(o2.getKey());  //ascending
//            }
//        });
//
//        for(Entry<String, Integer> entry : entries){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }

        //using lambdas
        System.out.println("\nLAMBDAS\n");
        Collections.sort(entries, (o1,o2)-> o1.getKey().compareTo(o2.getKey())); //ascending
        for(Entry<String, Integer> entr2 : entries){
            System.out.println(entr2.getKey()+" "+entr2.getValue());
        }

        //Using Streams
        System.out.println("\n streams\n");
        entries.stream().sorted(Comparator.comparing(e -> e.getValue())).forEach(System.out::println);
        entries.stream().sorted(Comparator.comparing(Entry::getValue)).forEach(System.out::println);
        entries.stream().sorted(Entry.comparingByValue()).forEach(System.out::println);
        



    }
}
