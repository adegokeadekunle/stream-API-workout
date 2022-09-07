package streams;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private int salary;

    public Employee(int id, String name, String dept, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public void setName(String name){
       this.name = name;
    }
    public String getName(String dept){
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
