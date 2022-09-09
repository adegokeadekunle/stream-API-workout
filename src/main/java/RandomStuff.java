import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomStuff {

        String service;
        String department;

    public RandomStuff(RandomStuff rd) {
        this.service = rd.service;
        this.department = rd.department;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(IntStream.range('a', 'd').toArray()));
        int a =  'd';
        System.out.println(a);
        System.out.println(numCount());
    }
    public static int numCount(){
        return LongStream.range(0,1000).mapToInt(E -> (int) E).sum();
    }
}
