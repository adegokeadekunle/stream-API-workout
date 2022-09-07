package functionalInterfaces;

import java.util.List;

public class SupplierIDemo {

    public static void main(String[] args) {
        List<Character> characters = List.of('b','a','f','d','e');
        List<String> stringList = List.of("a","b","c","d","e","f","g");

       // System.out.println(characters.stream().findAny().filter(chara -> chara =='a').stream().count());
        System.out.println(characters.stream().findAny().orElse('Z'));


        System.out.println(stringList.stream().findAny().orElse("No letters found "));
    }
}
