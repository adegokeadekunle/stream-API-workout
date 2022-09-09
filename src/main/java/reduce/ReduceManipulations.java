package reduce;

import entityAndDatabases.employee.EmpDataBase;
import entityAndDatabases.employee.Employee;

public class ReduceManipulations {

    public static void main(String[] args) {

        //getting average salary from employees with grade A
        double averageSalary = EmpDataBase.getEmployees()
                .stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(empl -> empl.getSalary())
                .mapToDouble(emp -> emp)
                .average()
                .getAsDouble();

        System.out.println(averageSalary);

        //sum of salary where grade is B
        double sumSalary = EmpDataBase.getEmployees()
                .stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("B"))
                .map(empl -> empl.getSalary())
                .mapToDouble(emp -> emp)
                .sum();
        System.out.println(sumSalary);
    }
}
