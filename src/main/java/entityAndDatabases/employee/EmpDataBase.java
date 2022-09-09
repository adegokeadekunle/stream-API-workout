package entityAndDatabases.employee;

import java.util.ArrayList;
import java.util.List;

public class EmpDataBase {
    public static List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(100,"Micheal","IT","A",50000));
        employees.add(new Employee(102,"Kola","Admin","B",90000));
        employees.add(new Employee(103,"Smith","Account","C",70000));
        employees.add(new Employee(104,"Johnny","Transport","B",45000));
        employees.add(new Employee(105,"Tyrone","Sales","A",48000));
        employees.add(new Employee(106,"Wale","Advertisement","A",32000));
        employees.add(new Employee(107,"Yemi","Marketing","C",30000));
        employees.add(new Employee(108,"Chioma","Commercials","B",44000));
        employees.add(new Employee(109,"Bayo","Customer service","B",90000));
        employees.add(new Employee(110,"Micheal","Transport","C",10000));
        employees.add(new Employee(111,"Zainab","IT","B",43000));

        return employees;

    }
}
