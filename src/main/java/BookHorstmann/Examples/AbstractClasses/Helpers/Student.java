package BookHorstmann.Examples.AbstractClasses.Helpers;

public class Student extends Person {
    private String major;

    /**
     * @param name Имя студента
     * @param major Специализация студента
     */
    public Student(String name, String surname, String major) {
        super(name, surname);
        this.major = major;
    }

    @Override
    public String getPersonDescription() {
        return "a student majoring in " + major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}
