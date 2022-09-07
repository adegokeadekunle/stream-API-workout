package streams.sort;

import streams.DataBase;
import streams.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingEmployee {
    public static void main(String[] args) {

        List<Employee> emp = DataBase.getEmployees();

        //Traditional method
        Collections.sort(emp,(o1,o2)-> (int)(o1.getSalary() - o2.getSalary()));
        emp.sort((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        System.out.println(emp);

        //sorting by salary
       emp.stream().sorted((o1,o2)-> (int)(o2.getSalary()- o1.getSalary())).forEach(System.out::println);

        emp.stream().sorted(Comparator.comparing(e -> e.getSalary())).forEach(System.out::println);

        emp.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println); //Ascending
        emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);//descending
    }
}
