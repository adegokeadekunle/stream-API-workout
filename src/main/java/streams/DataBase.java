package streams;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(100,"Micheal","IT",50000));
        employees.add(new Employee(102,"Kola","Admin",90000));
        employees.add(new Employee(103,"Smith","Account",70000));
        employees.add(new Employee(104,"Johnny","Transport",45000));
        employees.add(new Employee(105,"Tyrone","Sales",48000));
        employees.add(new Employee(106,"Wale","Advertisement",32000));
        employees.add(new Employee(107,"Yemi","Marketing",30000));
        employees.add(new Employee(108,"Chioma","Commercials",44000));
        employees.add(new Employee(109,"Bayo","Customer service",90000));
        employees.add(new Employee(110,"Micheal","Transport",10000));
        employees.add(new Employee(111,"Zainab","IT",43000));

        return employees;

    }
}
