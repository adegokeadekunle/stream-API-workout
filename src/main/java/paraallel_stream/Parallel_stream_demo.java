package paraallel_stream;

import entityAndDatabases.employee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Parallel_stream_demo {

    public static void main(String[] args) {

        long startTime ;
        long endTime ;

        //using plain stream and checking time used to execute code
        startTime = System.currentTimeMillis();
        IntStream.range(0,1000).forEach(i -> System.out.println(i));
        endTime = System.currentTimeMillis();

        System.out.println("completed in : "+(endTime - startTime)+" milliseconds");
        System.out.println("thread running on:" + Thread.currentThread().getName());

        //using parallel stream and checking time used to execute code
        startTime = System.currentTimeMillis();
        IntStream.range(0,1000).parallel().forEach(i -> System.out.println(i));
        endTime = System.currentTimeMillis();

        System.out.println("completed in : "+(endTime - startTime)+" milliseconds");
        System.out.println("thread running on :" + Thread.currentThread().getName());

        //NOTE : Parallel stream do not have ordered sequence because it runs on multiple threads
        // so the order of the result cannot be predicted. unlike the plain stream.


    }

}
