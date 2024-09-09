package BookHorstmann.Wildcards;

import BookHorstmann.Generics.GenericsExample;
import BookHorstmann.Wildcards.Helpers.Employee;
import BookHorstmann.Wildcards.Helpers.Manager;

//8.4.4 page 424
public class WildcardsExample {
    public static void main(String[] args) {
        Manager ceo = new Manager("Gus Greedy", 80000, 2003, 12, 15);
        Manager cfo = new Manager("Sid Sneaky", 60000, 2003, 12, 15);
        GenericsExample.Pair<Manager> buddies = new GenericsExample.Pair<>(ceo, cfo);

        System.out.println("Содержит ли пара buddies пустую ссылку на объект? " + PairAlg.hasNulls(buddies));

        printBuddies(buddies);

        ceo.setBonus(1000000);
        cfo.setBonus(500000);
        Manager[] managers = {ceo, cfo};
        GenericsExample.Pair<Employee> resultPair = new GenericsExample.Pair<>();

        System.out.println("Содержит ли пара resultPair пустую ссылку на объект? " + PairAlg.hasNulls(resultPair));

        minMaxBonus(managers, resultPair);
        System.out.println("first: " + resultPair.getFirst().getName() +
                ", second: " + resultPair.getSecond().getName());
        maxMinBonus(managers, resultPair);
        System.out.println("first: " + resultPair.getFirst().getName() +
                ", second: " + resultPair.getSecond().getName());


    }

    /* При использовании Upper Bounded Wildcards, в примере <? extends Employee> можно подставлять любой тип, наследующий Employee или сам Employee.
    Можно использовать только не модифицирующие вызовы, т.е. get.
     */
    public static void printBuddies(GenericsExample.Pair<? extends Employee> pair) {
        Employee first = pair.getFirst();
        Employee second = pair.getSecond();

        System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
    }

    /* При использовании Lower Bounded Wildcards, в примере <? super Manager> можно подставлять любой тип, от которого наследуется Manager (или родителя выше)
    или сам Manager.
    Можно использовать только модифицирующие вызовы, т.е. set.
     */
    public static void minMaxBonus(Manager[] managers, GenericsExample.Pair<? super Manager> pairResult) {
        if (managers == null || managers.length == 0) return;
        Manager min = managers[0];
        Manager max = managers[0];
        for (int i = 1; i < managers.length; i++) {
            if (min.getBonus() > managers[i].getBonus()) min = managers[i];
            if (min.getBonus() < managers[i].getBonus()) max = managers[i];
        }
        pairResult.setFirst(min);
        pairResult.setSecond(max);
    }

    public static void maxMinBonus(Manager[] managers, GenericsExample.Pair<? super Manager> pairResult) {
        minMaxBonus(managers, pairResult);
        PairAlg.swap(pairResult);
    }

    static class PairAlg {
        public static boolean hasNulls(GenericsExample.Pair<?> pair) {
            //Неограниченная подстановка
            //Метод set нельзя вызвать при такой подстановке, а get можно.
            //Может быт удобен для проверки содержит ли пара пустую ссылку на объект.
            return pair.getFirst() == null || pair.getSecond() == null;
        }

        public static void swap(GenericsExample.Pair<?> pair) {
            //Необобщенный метод, фиксированный параметр Pair<?>
            //Неограниченная подстановка
            swapHelper(pair);
        }

        public static <T> void swapHelper(GenericsExample.Pair<T> pair) {
            //Обобщенный метод
            //Захват подстановок - параметр обобщенного типа T захватывает подстановку во вспомогательном методе swapHelper.
            //Можно использовать, если вместо wildcard будет использоваться всегда один тип.
            //Например, обобщение Т не сможет захватить подстановку в примере ArrayList<Pair<?>>, т.к. обе пары могут быть с разными типами.
            T t = pair.getFirst();
            pair.setFirst(pair.getSecond());
            pair.setSecond(t);
        }
    }
}
