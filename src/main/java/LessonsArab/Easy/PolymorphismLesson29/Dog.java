package LessonsArab.Easy.PolymorphismLesson29;

public class Dog extends Animal{
    private String breed;
    public Dog(int id, String breed) {
        super(id);
        this.breed = breed;
    }

    public Dog(int id) {
        super(id);
    }

    public void barking() {
        System.out.println("Dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public String getBreed(){
        return breed;
    }
}
