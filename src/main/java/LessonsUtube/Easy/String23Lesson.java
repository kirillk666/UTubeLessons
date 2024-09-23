package LessonsUtube.Easy;

public class String23Lesson {
    // immutable является неизменяемым классом - immutable

    public static void main(String[]args){
        String x = "immutable";
        x.toUpperCase();
        System.out.println(x); // x вернется неизменным, т.к. нельзя изменить объект класса стринг, можно только вернуть новую строку
        x = x.toUpperCase();
        System.out.println(x + "\n");


        String string1 = "Hello";
        String string2 = "my";
        String string3 = "friend";
        String all = string1 + string2 + string3;
        /*
        Конкатенация = concatenation
        Создается сначала объект класса String string1 + string2, потом string1 + string2 + string3, что сильно бьет по памяти,
        если используется для контактенации нескольких объектов или в цикле.
         */
        System.out.println(all + "\n");

        StringBuilder allBuilder = new StringBuilder("Hello"); // mutable
        System.out.println(allBuilder);
        allBuilder.append("my").append("friend");
        /*Concatenation, которая экономит память, т.к. не создаются новые объекты String.
        Можно вызывать метод append по цепочке - method chaining
         */
        System.out.println(allBuilder + "\n");

        System.out.printf("string is %s", "good"); // %s используется, чтобы подставить String в строку
        System.out.printf("\nstring is %d", 7); // %d - int
        System.out.printf("\nstring is %10d", 7); // %10d - ширина строки = 10 символов
        System.out.printf("\nstring is %-10d", 7); // %-10d - пустая часть справа
        System.out.printf("\n%s equals %f, not %d", "PI", 3.14, 3); // %f - floating point. Можно комбинировать разные подстановки
        System.out.printf("\n%s equals %.2f, not %d", "PI", 3.14111111111, 3); // %.2f - форматирование нецелых чисел + округление
    }
}
