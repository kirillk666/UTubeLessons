package RandomTasks.SingletonPattern;

public class Earth implements Planet{
    //Нужно добавить в класс приватное статическое поле, содержащее одиночный объект.
    private static Earth instance;

    /*
    Сделать конструктор класса (конструктор по-умолчанию)
    приватным (чтобы доступ к нему был закрыт за пределами класса, тогда он не сможет возвращать новые объекты)
    */
    private Earth() {}

    //Объявить статический создающий метод, который будет использоваться для получения одиночки.
    public static Earth getInstance() {
        if (instance == null) { //Ленивая Инициализация (Lazy Initialization).
            // Это прием в программировании, когда ресурсоемкая операция (а создание объекта – это ресурсоемкая операция) выполняется по требованию, а не заблаговременно.
            // Другими словами, наш объект создается в момент обращения к нему, а не заранее.
            instance = new Earth();
        }
        return instance;
    }

    @Override
    public void rotate() {
        System.out.println("Earth rotates with speed 1670 km/h.");
    }
}
