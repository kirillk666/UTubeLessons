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
         */
    }
}
