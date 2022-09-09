package reduce;

import java.util.Arrays;
import java.util.List;

public class StringWithReduceMethod {

    public static void main(String[] args) {
        List<String> courses = Arrays.asList("Java","Hibernate","JSP","Postgres","Javascript","React");

        //finding the longest string in an array
        String longestWord = courses.stream()
                .reduce((course1,course2)-> course1.length() > course2.length() ? course1:course2)
                .get();
        System.out.println(longestWord);
    }
}
