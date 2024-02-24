package Api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class Serialization {
    /**
     * Сериализация это процесс сохранения состояния объекта в последовательность байт;
     * Десериализация это процесс восстановления объекта, из этих байт.
     * Чтобы парсить json используем на проекте библиотеку Jackson - библиотека, которая конвертирует строки JSON и
       простые объекты Java (англ POJO — Plain Old Java Object).
       Он также поддерживает многие другие форматы данных, такие как CSV, YML и XML.
       По сути json следует модели map (KV), допускающей вложенные объекты и значения
     */

    public static void main(String[] args) throws JsonProcessingException {
        Employee employee = new Employee("Mark", "James", 20);
        ObjectMapper objectMapper = new ObjectMapper();

        /*
         Не будет работать без getter/setter.
         Способ, которым ObjectMapper определяет, какое поле JSON соответствует какому полю POJO,
         заключается в сопоставлении имен полей JSON с именами геттеров и сеттеров в POJO.
         Это делается путем удаления частей «get» и «set» в именах геттеров и сеттеров и преобразования первого символа имени оставшегося метода в нижний регистр.
         */
        String json = objectMapper.writeValueAsString(employee);

        System.out.println(json);
    }



    //Lombok для обработки шаблонного кода для геттеров, сеттеров и конструкторов.
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Employee {
        private String firstName;
        private String lastName;
        private int age;
/*

        public Employee(String fistName, String lastName, int age) {
            this.firstName = fistName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }
*/
    }
}
