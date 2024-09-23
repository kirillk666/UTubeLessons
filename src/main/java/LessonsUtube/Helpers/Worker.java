package LessonsUtube.Helpers;

public class Worker implements Comparable<Worker>{
    private static int idCounter = 1;
    private final Integer id;
    private String name;
    private Integer salary;

    public Worker(String name, int salary) {
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
        return "Worker{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Worker anotherEmp) {
        int result = this.salary.compareTo(anotherEmp.salary);
        if(result == 0) {
            result = this.id.compareTo(anotherEmp.id);
        }
        return result;
    }
}
