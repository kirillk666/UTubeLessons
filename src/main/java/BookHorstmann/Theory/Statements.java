package BookHorstmann.Theory;


public class Statements {
    public static void main(String[] args) {
        /** Статические методы не оперируют объектами
            int n = Employee.getNext(id); */

        /** Вызов по ссылке - метод получает из вызывающей части программы местоположение переменной.
         !!! В java всегда используется вызов по значению.
         Яркий пример, метод не может видоизменить содержимое переменных, передаваемых ему в методе.
         Это означает, что метод получает копии значений всех своих параметров.

         Метод может менять состояние объекта, т.к. получает копию ссылки на объект.
            public static void tripleSalary(Employee x) {
                x.raiseSalary(200)
            }
            harry = new Employee(...);
            tripleSalary(harry);
         При вызове метода создается копия переменной harry, т.е. ссылки на объект harry.
         Копия и оригинал ссылки указывают на один и тот же объект harry.
         Переменная x инициализируется копией ссылки на объект harry, т.е. х = копия ссылки.
         Далее метод raiseSalary() применяется к объекту по этой копии ссылки (х) и объект типа Employee, на который ссылается x и harry,
         получает сумму зарплаты, увеличенную втрое.
         Далее метод завершает свою работу и его параметр х больше не используется.
         harry продолжает ссылаться на объект типа Employee, где зарплата увеличена втрое.
         */

        /** Модификаторы доступа - служат для определения границ области видимости компонентов программы.
         * private - ограничивает область видимости пределами класса;
         * public - не ограничивает область видимости;
         * protected - ограничивает область видимости пределами пакета и всеми подклассами;
         * default (не установлен) - область видимости ограничивается пределами пакета.
         */

        /** Приведение типов - принудительное преобразование одного типа в другой.
         * Можно выполнять только в иерархии наследования (вверх по цепочке наследования).
         * Чтобы проверить корректность приведения суперкласса к подклассу, выполняем операцию instanceof.
         {@link BookHorstmann.Examples.Inheritance.InstanceOf}
         */

        /** Суперкласс - верхний в иерархии наследования класс. Родительский - от него начинается наследование.
         * Любой класс может иметь только один суперкласс, но может реализовывать сколько угодно интерфейсов. В JAVA нет множественного наследования.
         */

        /** Полиморфизм - способность переменной (employee) ссылаться на объекты, имеющие разные фактические типы.
         * Динамическое связывание - автоматический выбор нужного метода во время выполнения программы.
         ({@link BookHorstmann.Examples.Inheritance.Inheritance});
         */

        /** Абстракция
         * Абстрактный класс - основа для разработки других классов, а не класс, позволяющий создавать конкретные объекты.
         {@link BookHorstmann.Examples.AbstractClasses.AbstractClasses}
         */

        /** {@link Object}
         * Исходный суперкласс всех остальных классов, каждый класс в java расширяет этот класс.
         * Один из основных методов класса Object - equals()
         {@link BookHorstmann.Examples.Object.Equals.Equals}
         Object.hashCode() - целое число, генерируемое на основе конкретного объекта.
         * hashCode можно рассматривать как некоторый шифр, который с высокой долей вероятности будет уникален.
         */

        /** Generics (обобщение, параметризация) <String>
         * {@link LessonsArab.Easy.Generics33.Generics}
         */

        /** Оболочки/классы обертки int - Integer и тд
         * Классы объектных оболочек являются неизменяемыми, т.е. нельзя изменить значение, хранящееся в объектной оболочке
         * после ее создания.
         */
        Double d = 4.33;
        System.out.println("d = " + d + ", d.hashCode() = " + d.hashCode());
        d += 5.666;
        System.out.println("d = " + d + ", d.hashCode() = " + d.hashCode());
        /* Применение обертки типа ArrayList<Integer> оказывается менее эффективно, чем массива int[i].
        Причина: каждое примитивное значение int инкапсулировано внутри объекта обертки и для его записи или извлечения
        необходимо применять дополнительные действия. Таким образом, применение объектных оболочек оправдано лишь для
        небольших коллекций, когда удобство программиста важнее эффективности самой программы.
         */

        /**{@link java.lang.invoke.DirectMethodHandle.Interface}
         * Не является классом (нельзя создать командой new), представляет собой ряд требований предъявляемых к классу, который должен соответствовать интерфейсу.
         * Все методы интерфейса изначально идут как public static,
           указывать модификатор доступа не нужно (double milesPerGallon() или void move(double x, double y).
         * С 9‑й версии java в интерфейсе могут быть объявлены private методы, закрытый метод может быть static или методом самого экземпляра
           (т.е. данного интерфейса). Использование таких методов ограничивается ролью вспомогательных методов для других методов этого интерфейса.
         * В Интерфейсах отсутствуют поля экземпляра и, само собой, в методах интерфейса нельзя ссылаться на поля экземпляра.
         * Однако можно создавать статические константы (double SPEED_LIMIT = 95.00), по умолчанию имеют public static final, указывать отдельно не нужно.
         * Если класс наследует интерфейс, то в классе должны быть определены все методы интерфейса.
         * Любой класс может иметь только один суперкласс, но может реализовывать сколько угодно интерфейсов. В JAVA нет множественного наследования.
         * Если одинаковый метод (getName()) есть и в интерфейсе, и в суперклассе, то метод из интерфейса игнорируется.
         * Если одинаковый метод (getName()) есть в обоих интерфейсах (Person, Named), то при вызове метода из класса, имплементирующего оба интерфейса,
           нужно указать это явным образом: Person.super.getName();
         */

        /** Обратный вызов (Callback)
         * Действие, которое должно произойти там, где наступает конкретное событие (щелчок мышки, выбор элемента).
         * {@link BookHorstmann.Examples.Callback.TimerTest}
         * Когда функция выполняется долго, нет смысла ожидать её завершения (визуально это будет выглядеть как зависший браузер, и пользователь закроет сайт).
           Поэтому ей передают callback, мол, сама сообщишь, когда закончишь работу.
         */
    }
}
