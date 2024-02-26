package Api;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class Serialization {
    /**
     * Сериализация это процесс сохранения состояния объекта в последовательность байт;
     * Десериализация это процесс восстановления объекта, из этих байт.
     * Чтобы парсить json используем на проекте библиотеку Jackson - библиотека, которая конвертирует строки JSON и
       простые объекты Java (англ POJO — Plain Old Java Object).
       Он также поддерживает многие другие форматы данных, такие как CSV, YML и XML.
       По сути json следует модели map (KV), допускающей вложенные объекты и значения
     */

    public static void main(String[] args) throws IOException {
        Employee employee = new Employee("Mark", "James", 20);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule()); //Нужно, чтобы блок "Работа с датами in Jackson" не выкидывал exception.

        /*
         Не будет работать без getter/setter.
         Способ, которым ObjectMapper определяет, какое поле JSON соответствует какому полю POJO,
         заключается в сопоставлении имен полей JSON с именами геттеров и сеттеров в POJO.
         Это делается путем удаления частей «get» и «set» в именах геттеров и сеттеров и преобразования первого символа имени оставшегося метода в нижний регистр.
         Взято тут "https://habr.com/ru/companies/otus/articles/687004/"
         */
        String json = objectMapper.writeValueAsString(employee); //Преобразование POJO в строку JSON:
        System.out.println("Преобразование POJO в строку JSON:" + json + "\n");


        //Преобразование строки JSON в объект Employee (POJO) с помощью ObjectMapper
        String employeeJson = "{\n" +
                " \"firstName\" : \"Jalil\",\n" +
                " \"lastName\" : \"Jarjanazy\",\n" +
                " \"age\" : 30\n" +
                "}";
        System.out.println("Преобразование строки JSON в объект Employee (POJO): " + employeeJson + "\n");
        Employee employee2 = objectMapper.readValue(employeeJson, Employee.class);
        assertEquals(employee2.getFirstName(), "Jalil");


        //Создание POJO из файла JSON
        File file = new File("src/main/java/Api/Employee.json");
        Employee employee3 = objectMapper.readValue(file, Employee.class);
        assertEquals(employee3.getAge(), 44);
        assertEquals(employee3.getLastName(), "Simpson");
        assertEquals(employee3.getFirstName(), "Homer");
        System.out.println("Создание POJO из файла JSON: " + employee3 + "\n");


        //Создание list POJO из JSON
        File file2 = new File("src/main/java/Api/Employees.json");
        List<Employee> employeeList = objectMapper.readValue(file2, new TypeReference<>(){});
        assertEquals(employeeList.size(), 2);
        assertEquals(employeeList.get(0).getAge(), 33);
        assertEquals(employeeList.get(0).getLastName(), "Simpson");
        assertEquals(employeeList.get(0).getFirstName(), "Marge");
        System.out.println("Создание list POJO из JSON: " + employeeList + "\n");


        //Создание Map из JSON
        Map<String, Object> employeeMap = objectMapper.readValue(file, new TypeReference<>(){});
        assertEquals(employeeMap.get("firstName"), "Homer");
        assertEquals(employeeMap.get("lastName"), "Simpson");
        assertEquals(employeeMap.get("age"), 44);
        System.out.println("Создание Map POJO из JSON: " + employeeMap + "\n");


        //Игнорирование неизвестных полей JSON
        File file3 = new File("src/main/java/Api/EmployeeWithUnknownFields.json");
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Employee employee4 = objectMapper.readValue(file3, Employee.class);
        System.out.println("Игнорирование неизвестных полей JSON: " + employee4 + "\n");


        //Работа с датами in Jackson
        //Дата в JSON
        Order order = new Order(1, LocalDate.of(1900, 2, 1));
        String jsonDate = objectMapper.writeValueAsString(order);
        System.out.println("Дата в JSON: " + jsonDate + "\n");
        //JSON в дату
        File file4 = new File("src/main/java/Api/order.json");
        Order order2 = objectMapper.readValue(file4, Order.class);
        assertEquals(order2.getDate().getYear(),2000);
        assertEquals(order2.getDate().getMonthValue(), 4);
        assertEquals(order2.getDate().getDayOfMonth(), 30);
        System.out.println("JSON в дату: " + order2 + "\n");
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

        @Override
        public String toString() {
            return "Employee{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Order {
        private int id;
        @JsonFormat(pattern = "dd/MM/yyyy")
        private LocalDate date;

        @Override
        public String toString() {
            return "Order{" +
                    "id=" + id +
                    ", date=" + date +
                    '}';
        }
    }
}
