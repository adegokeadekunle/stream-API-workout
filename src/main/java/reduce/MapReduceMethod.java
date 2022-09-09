package reduce;

import java.util.Arrays;
import java.util.List;

public class MapReduceMethod {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,3,5,17,4,5,8,6,9,7);

        //Traditional method of summing the numbers in the array list
        int sum = 0;

        for (int no:numbers){
            sum = sum+no;
        }
        System.out.println(sum);
        
        //using stream and sum()
        int sum1 = numbers.stream().mapToInt(num -> num).sum();
        System.out.println(sum1);

        //using reduce method
        Integer sum2 = numbers.stream().reduce(0,(a,b) -> a+b);  // identity is for where the default count is starting for the operation
//        Integer sum2 = numbers.stream().reduce(0, Integer::sum);   //using method reference
//        int sum2 = numbers.stream().mapToInt(nu -> nu).reduce(0,(a,b) -> a+b); // if you want to return primitive u map to the primitive type (int,long,double) etc
        System.out.println(sum2);

        //performing multiplication with reduce method
        Integer multiplyResult = numbers.stream().reduce(1,(a,b)-> a*b);
        System.out.println(multiplyResult);

        //performing ternary
        Integer maxValueResult = numbers.stream().reduce(0,(a,b)-> a > b ? a:b);
        System.out.println(maxValueResult);
        //with method reference
        Integer maxValueWithMethodReference = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxValueWithMethodReference);

    }
}
