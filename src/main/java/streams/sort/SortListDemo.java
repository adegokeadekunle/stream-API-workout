package streams.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(2);
        nums.add(4);
        nums.add(7);
        nums.add(9);
        nums.add(10);
        nums.add(11);
        nums.add(45);
        nums.add(23);
        nums.add(66);
        nums.add(12);
        nums.add(3);

        //primitive sorting
        Collections.sort(nums);// ascending
        System.out.println(nums);
        Collections.reverse(nums);// ascending//desending
        System.out.println(nums);

        //using streams
       // System.out.println( nums.stream().sorted().collect(Collectors.toList()));//ascending
        nums.stream().sorted().forEach(sorted -> System.out.println(sorted));
       // System.out.println(nums.stream().sorted(Collections.reverseOrder()).toList());
        nums.stream().sorted(Collections.reverseOrder()).forEach(sorted -> System.out.println(sorted));

    }
}
