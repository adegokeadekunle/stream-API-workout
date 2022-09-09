package paraallel_stream;

import entityAndDatabases.employee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamWithData {

    public static void main(String[] args) {

        List<Employee> employees = dummyDatabase();

        long start;
        long end;
        //plain stream
        start = System.currentTimeMillis();
        double plainStreamSalary = employees.parallelStream().map(Employee::getSalary).mapToInt(a -> a).average().getAsDouble();
        System.out.println(plainStreamSalary);
        end = System.currentTimeMillis();
        long plainTime = end - start;

        start = System.currentTimeMillis();
        double parallelStreamSalary = employees.parallelStream().map(Employee::getSalary).mapToInt(a -> a).average().getAsDouble();
        System.out.println(parallelStreamSalary);
        end = System.currentTimeMillis();
        long parallelTime = end - start;

        System.out.println("plain stream : "+ plainTime + " milliseconds"+"\nparallel stream : " + parallelTime + " milliseconds");

    }

    public static List<Employee> dummyDatabase(){

        List<Employee> employee = new ArrayList<>();
        // creating employee list of 1000 employees
        for (int i =1 ; i<1000; i++){
            employee.add(new Employee(i,"employee"+i,"IT","A",new Random().nextInt(1000*100)));
        };
        return employee;

    }
}
