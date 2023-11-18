package BookHorstmann.Examples.AbstractClasses.Helpers;

public abstract class Person {
    public abstract String getPersonDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
