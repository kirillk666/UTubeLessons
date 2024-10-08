package BookHorstmann.Examples.Object.Equals.Helpers;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public boolean equals(Object otherObject) {
        //Быстро проверить объекты на идентичность
        if (this == otherObject) return true;

        //Проверить если явный параметр имеет пустое значение null
        if (otherObject == null) return false;

        //Если классы не совпадают, они не равны
        if (getClass() != otherObject.getClass()) return false;

        //Теперь известно, что otherObject - непустой объект типа Employee
        var other = (Employee) otherObject;

        //Проверить, содержат ли поля одинаковые значения
        return Objects.equals(name, other.name)
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}

