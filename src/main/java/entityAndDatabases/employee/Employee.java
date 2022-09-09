package entityAndDatabases.employee;

import lombok.Builder;

@Builder
public class Employee {
    private int id;
    private String name;
    private String dept;
    private String grade;
    private int salary;

    public Employee(int id, String name, String dept,String grade, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.grade = grade;
        this.salary = salary;
    }

    public void setName(String name){
       this.name = name;
    }
    public String getName(){
        return name;
    }

    public  void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDept(String dept){
        this.dept = dept;
    }

    public String getDept(){
        return dept;
    }

    public void setGrade(String grade){this.grade = grade;}

    public String getGrade() {return grade;}

    public void salary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
