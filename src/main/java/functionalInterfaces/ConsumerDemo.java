package functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
       // Consumer<Integer> consumer  = (t) -> System.out.println("print a check for consumer interface : "+t);
        Consumer<Integer> consumer  = t -> System.out.println("print a check for consumer interface : "+t); // wecan also remove the collybraces
        consumer.accept(1000);

        List<Integer> items = List.of(1,2,3,4,5,6,7,8);
        items.stream().forEach(item -> System.out.println("find the value of each items : "+item));
    }
}
