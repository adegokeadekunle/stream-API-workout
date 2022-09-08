package streams.sort;

import entityAndDatabases.employee.Employee;

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
        
                //USING TREEMAP

        Map<Employee, Integer> empMap = new TreeMap(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getSalary() - o2.getSalary());
            }
        });

        // using lambdas

        //Collections.sort((Employee,(o1, o2) ->  o ))
        empMap.put(new Employee(1,"Adekunle","IT",1_400_000),100);
        empMap.put(new Employee(2,"Bayo","Security",200_000),101);
        empMap.put(new Employee(3,"Wale","Transport",800_000),102);
        empMap.put(new Employee(4,"Yomi","Consulting",900_000),103);
        empMap.put(new Employee(5,"Funmi","Care",1_000_000),104);
        empMap.put(new Employee(6,"Titi","Medical",850_000),105);
        empMap.put(new Employee(7,"Bioye","Security",240_000),106);
        empMap.put(new Employee(8,"Foluke","Education",830_000),107);
        empMap.put(new Employee(9,"Toyin","Marketing",1_000_000),108);
        empMap.put(new Employee(10,"Idowu","Marketing",50_000),109);

        empMap.entrySet().stream().sorted(Comparator.comparing( e -> e.getKey().getSalary())).forEach(System.out::println);
        empMap.entrySet().stream().sorted(Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);// alternative way

         //adding sorting
        empMap.entrySet().stream().sorted(Comparator.comparing( e -> e.getKey().getSalary())).filter(s  -> s.getKey().getSalary() < 500000).forEach(System.out::println);

       // System.out.println(empMap);

    }
}
