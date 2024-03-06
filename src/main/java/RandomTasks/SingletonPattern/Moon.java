package RandomTasks.SingletonPattern;

public class Moon implements Planet{
    private static Moon instance;

    private Moon() {};

    public static Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }

    @Override
    public void rotate() {
        System.out.println("Moon rotates with speed 37 km/h.");
    }
}
