package Helpers;

public class Employee implements Comparable<Employee>{
    private static int idCounter = 1;
    private final Integer id;
    private String name;
    private Integer salary;

    public Employee(String name, int salary) {
        this.id = idCounter++;
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.salary.compareTo(anotherEmp.salary);
        if(result == 0) {
            result = this.id.compareTo(anotherEmp.id);
        }
        return result;
    }
}
