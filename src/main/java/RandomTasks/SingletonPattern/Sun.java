package RandomTasks.SingletonPattern;

public class Sun implements Planet {
    private static Sun instance;

    private Sun() {};

    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }

    @Override
    public void rotate() {
        System.out.println("Sun rotates with speed 7200 km/h");
    }
}
