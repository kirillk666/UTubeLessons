package Lessons.PolymorphismLesson29;

public class Animal {
     private int id;

    public Animal(int id){
        this.id = id;
    }
    public void eat(){
        System.out.println("Animal is eating");
    }

    public String toString() {
        return String.valueOf(id);
    }

    // Можно переопределить метод equals() класса Object()
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
