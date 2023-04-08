package AccessModifiresLesson28.Package1;

public class Person {
   private int age;
   private int id;


    public Person(int age, int id){
       this.id = id;
       this.age = age;

   }

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public int getId() {
        System.out.println(id);
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;


    }
}
