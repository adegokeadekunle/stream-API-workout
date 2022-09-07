package functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
//        Predicate<Integer> predicateInterface = (predicate) -> {
//            if(predicate %2 == 0){
//                return true;
//            }
//            else {
//                return false;}
//        };
//        System.out.println(predicateInterface.test(35));
//
        // BETTER OPTIMIZING THE ABOVE
        Predicate<Integer> predicateInterface = predicate -> predicate % 2 == 0 ;
        System.out.println(predicateInterface.test(32));

        //SORTING USING FILTER()
        List<Integer> items = List.of(1,2,3,4,5,6,7,8);
        items.stream().filter(item -> item % 2 == 0 ).forEach(item -> System.out.println("item value is  "+item ));

    }
}
