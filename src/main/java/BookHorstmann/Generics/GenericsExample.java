package BookHorstmann.Generics;

//8.2 page 398 + 8.3 page 401
public class GenericsExample {
    public static void main(String[] args) {
        String[] names = {"Marry", "Kate", "Olga", "Viktoria", "N", "Nefertiti"};

        System.out.println("min: " + ArrayAlg.minMax(names).getFirst());
        System.out.println("max: " + ArrayAlg.minMax(names).getSecond());
    }

    static class ArrayAlg {
        public static Pair<String> minMax(String[] arrStrings) {
            if (arrStrings == null || arrStrings.length == 0) return null;
            String max;
            String min = max = arrStrings[0];
            for (String arrString : arrStrings) {
                if (arrString.length() < min.length()) min = arrString;
                if (arrString.length() > max.length()) max = arrString;
            }
            return new Pair<>(min, max);
        }
    }

    //Обобщенный класс
    public static class Pair<T> {
        private T first;
        private T second;

        public Pair() {
            first = null;
            second = null;
        }

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }

        public void setFirst(T first) {
            this.first = first;
        }

        public void setSecond(T second) {
            this.second = second;
        }
    }
}
