package streams.filter;

import entityAndDatabases.employee.Employee;

import java.util.List;

import static entityAndDatabases.employee.DataBase.getEmployees;

public class EmployeeService {
    public List<Employee> evaluateTaxUsers(){
        List<Employee> taxPayers = getEmployees();
        return taxPayers.stream().filter( tax -> tax.getSalary() > 50000).toList();

    }

    public List<Employee> evaluateTaxUsersWithInput(String input){
        List<Employee> taxPayers = getEmployees();
//        if(input.equalsIgnoreCase("tax")) return taxPayers.stream().filter( tax -> tax.getSalary() > 50000).toList();
//        else  return taxPayers.stream().filter( tax -> tax.getSalary() < 50000).toList();

        //using tenary to optimize the code
        return (input.equalsIgnoreCase("tax")) ? taxPayers.stream().filter( tax -> tax.getSalary() > 50000).toList() :
         taxPayers.stream().filter( tax -> tax.getSalary() < 50000).toList();

    }

    public static void main(String[] args) {
        EmployeeService emp = new EmployeeService();
        System.out.println(emp.evaluateTaxUsers());
        //System.out.println(emp.evaluateTaxUsersWithInput("non-tax"));
        System.out.println(emp.evaluateTaxUsersWithInput("tax"));
    }
}
