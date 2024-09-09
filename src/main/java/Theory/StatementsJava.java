package Theory;


import BookHorstmann.Examples.MethodReference.MethodReferenceExample;

public class StatementsJava {
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
         * Экземпляр обобщенного типа получается в р-те подстановки имени типа вместо переменной типа <T>, т.е.
           обобщенный класс действует как фабрика обычных классов, см. {@link BookHorstmann.Generics.GenericsExample}.
         * В именах переменных принято применять:
                E - элементы коллекций;
                K, V - типы ключей и значений в таблице (map)
                T, S, U - "любой тип вообще"
         * Обобщенный метод можно определять как в обобщенном, так и в обычном классе
         * Можно накладывать ограничения для типа <T> следующим образом: <T extends Comparable & любой_другой_ограничивающий_тип)>
           В кач-ве ограничения может быть только один класс и/или сколько угодно интерфейсов, см {@link BookHorstmann.Generics.GenericsExample2}.

         Из-за стирания типов(<T> меняется на <Object>) при компиляции нельзя:
         * Нельзя подставить примитивный тип в кач-ве типа параметра <T>
         * Нельзя создавать экземпляры переменных типа (new T())
         * Нельзя объявить массив параметризованных типов (var table = new Pair<String>[10]). Будет {@link ArrayStoreException}. В данном примере можно использовать ArrayList<Pair<String>>.
         * Нельзя использовать с varargs - переменным числом аргументов (T... ts), т.к. под капотом оно преобразуется в массив

         * Между Pair<Employee> и Pair<Manager> нет никаких отношений наследования, несмотря на то, что Manager наследует Employee
         */

        /** Подстановочный тип (wildcards)
         * В подстановочном типе параметр типа может быть переменным.
         * {@link BookHorstmann.Wildcards.WildcardsExample}
         * Upper Bounded Wildcards
         * Lower Bounded Wildcards
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
         * {@link BookHorstmann.Examples.Callback.TimerTest}
         * Действие, которое должно произойти там, где наступает конкретное событие (щелчок мышки, выбор элемента).
         * Когда функция выполняется долго, нет смысла ожидать её завершения (визуально это будет выглядеть как зависший браузер, и пользователь закроет сайт).
           Поэтому ей передают callback, мол, сама сообщишь, когда закончишь работу.
         */

        /** Лямбда-выражение (Lambda)
         {@link LessonsArab.Normal.Lambda.WhatReplacesLambda}
         {@link LessonsArab.Normal.Lambda.AnotherLambdaExample}
         {@link BookHorstmann.Examples.Lambda.LambdaExamples}
         * Позволяет использовать функциональное программирование, в то время как java - ООП.
         * Позволяет использовать метод в кач-ве параметра.
         * Можно использовать только с функциональным интерфейсом, т.е. который содержит только 1 абстрактный метод.
         * В лямбде -> разделяет параметры метода и тело метода, которое было бы у метода соответствующего класса,
         имплементировавшего функциональный интерфейс.
         * Если в абстрактном методе более одного параметра, то их нужно всегда брать в скобки
         * Лямбду можно присвоить в переменную.
         * Лямбда применяется для отложенного выполнения, т.е. по мере необходимости/после наступления какого-то
           события/после определенного действия и т.д.
         */

        /** Ссылка на метод (Method reference)
         {@link MethodReferenceExample}
         {@link BookHorstmann.Examples.Interface.ComparatorWithMethodReference}
         * Три типа ссылок:
            1) Равнозначно лямбда выражению, параметры которого передаются методу
                объект::методЭкземпляра  ==   объект -> методЭкземпляра(объект)
                System.out::println      ==   x -> System.out.println(x)
            2) Первый параметр ссылки на метод становится неявным параметром метода
                Класс::методЭкземпляра        ==   (парам1, парам2) -> парам1.методЭкземпляра(парам2)
                String::compareToIgnoreCase   ==   (x, y) -> x.compareToIgnoreCase(y)
                String::trim                  ==   x -> x.trim()
                String::concat                ==   (x, y) -> x.concat(y)
            3) Все параметры передаются статическому методу
                Класс::статическийМетод  ==  (парам1, парам2) -> статическийМетод(парам1, парам2)
                Math::pow                ==  (x, y) -> Math.pow(x, y)
         * Lambda можно превратить в Method reference, только если в теле Lambda вызывается единственный метод и
           больше ничего не делается. Т.е. в примере s -> s.length() == 0 вызывается единственный метод, но кроме того,
           в нем производится сравнение, поэтому нельзя превратить в Method reference.
         */

        /** Внутренние классы (Inner classes)
         * {@link BookHorstmann.Examples.InnerClasses.InnerClassesExample}
         * Private могут быть только внутренние классы, обычные могут быть либо public, либо protected
         * Внутренний класс имеет доступ не только к своим полям, но и к полям создавшего его объекта, т.е.
           экземпляру внешнего класса.
         */

        /** Исключения (Exceptions)
         * Все исключения - экземпляры класса {@link Throwable}. Далее иерархия наследования разделяется на {@link Error} и {@link Exception}, который
           в свою очередь делится на {@link java.io.IOException} и {@link RuntimeException}.
         * Исключения вида {@link RuntimeException} всегда возникают по вине программиста их можно избежать с помощью доп. проверок или должной внимательности.
           Например, {@link ArrayIndexOutOfBoundsException} или {@link NullPointerException}.
         * Ошибки, производные от {@link Error} или {@link javax.management.RuntimeErrorException} - непроверяемые.
         */

        /** Утверждения (Assert)
         * Используются только для тестирования и отладки кода.
         * assert condition; => assert x >= 0;
         * assert condition : expression; => assert x>=0 : x; Передача значения переменной x объекту типа {@link AssertionError}, для дальнейшего вывода.
         * По умолчанию assert запрещены, поэтому их выполнение игнорируется, чтобы не замедлять выполнение программы.
           Включается отдельно java -enableassertions MyApp
         */
        
        /** Предикат ({@link java.util.function.Predicate}
         * predicate (boolean-valued function) of one argument
         */

        /** {@link java.util.Collection}
         * Для перебора элементов коллекции можно использовать for each (т.к. Collection extends Iterable) {@link LessonsArab.Normal.Collection.List.LinkedListExample}
         */

        /**
         * Patterns
         * Factory - создание разных объектов через класс фабрики {@link RandomTasks.FactoryPattern.CoffeeFactory}
         * Singleton - одиночка. {@link RandomTasks.SingletonPattern.Earth}
           Гарантирует, что у класса есть только один объект (один экземпляр класса) и к этому объекту предоставляется глобальная точка доступа.
         */
    }
}
