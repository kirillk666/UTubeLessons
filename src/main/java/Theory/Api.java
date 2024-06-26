package Theory;

public class Api {
    /**
     * По сути API - набор возможностей и методов/функций, которые программа предоставляет для работы с ней.
     * Тестирование API - тестирование бизнес процессов, поведения системы через определенный набор методов/функций, которые описаны в документации.
     * __________REST representational state transfer/передача состояния представления_______________:
     -  использует json, но можно и другие (xml и т.д.);
     -  зависит от транспортного протокола: HTTP и базируется на нем;
     - В архитектуре REST отсутствие сохранения состояния относится к методу связи, при котором сервер выполняет каждый клиентский запрос независимо от всех предыдущих запросов.
     - Клиенты могут запрашивать ресурсы в любом порядке, и каждый запрос либо изолирован от других запросов, либо его состояние не сохраняется.
       Это конструктивное ограничение REST API подразумевает, что сервер может каждый раз полностью понять и выполнить запрос.
     - Общедоступные API предъявляют более низкие требования к безопасности и требуют большей гибкости, благодаря чему с ними может взаимодействовать любой желающий.
       Поэтому REST – лучший выбор при создании общедоступных API.
     *_______ SOAP________:
      - использует xml;
      - не зависит от транспортного протокола: HTTP, SMTP, TCP, JMS;
      - обязательно нужны заголовок и тело;
      - не кешируется на сервере
      - более сложные стандарты и используется для специфических приложений, например, для платежных и банковских систем.
      - Более жесткие стандарты безопасности.
      - Соответствие требованиям ACID (atomicity - атомарность, consistency - согласованность, isolation - изоляция, durability - надежность) — набор требований,
        которые обеспечивают сохранность ваших данных. Что особенно важно для финансовых операций.
        Мы же не хотим остаться без денег из-за разрыва соединения или ошибки в ПО, не так ли?
     * Список действий и операций для работы с API перечислен в контракте. Для REST - WADL, для SOAP - WSDL.
     * Cookie - небольшой фрагмент данных, отправленный веб-сервером и хранимый в браузере пользователя.
       Веб-клиент (браузер) каждый раз пересылает этот фрагмент веб-серверу в составе http запроса.
       Чаще всего используется для хранения сессии, настроек предпочтений, статистики и т.д.
     */

    /*
    GET https://api.nasa.gov/planetary/apod
    www - world wide web
    /planetary/apod - endpoint
     */

    /**
     * Идемпотентная операция в информатике — действие, многократное повторение которого эквивалентно однократному.
       Корректно реализованные методы GET, HEAD, PUT и DELETE идемпотентны, но не методы POST/PATCH.

       Например, POST будет создавать новый ресурс каждый раз при одном и том же вызове. Т.е. есть задать для вызова директорию /project/, то в ней и будут создаваться файлы.
       Для запросов PUT клиент должен знать точный URI (Uniform Resource Identifier) ресурса. Т.е. /project/filename.
       PUT используется для генерации с точно известным URI или для обновления ресурса, но только с полной заменой. Это означает, что мы не можем делать частичные обновления.

       PATCH используется для частичного изменения ресурса.
       PATCH, подобно POST, может также влиять на ресурсы, отличные от того, который указан в URI запроса.
       PATCH не является ни безопасным, ни идемпотентным. Например, многократные (частичные) запросы на обновление могут добавлять товар несколько раз в корзину.

       Также все безопасные методы (безопасный метод проводит операции "только чтение" (read-only), например: GET, HEAD или OPTIONS) являются идемпотентными.
       По спецификации, сервер должен возвращать идентичные ответы на идентичные GET-запросы (при условии, что ресурс не изменился).
       Это позволяет корректно кэшировать эти ответы, снижая нагрузку на сеть.
     */

    /** Status codes - https://developer.mozilla.org/ru/docs/Web/HTTP/Status
     * Информационные ответы (100 – 199)
     * Успешные ответы (200 – 299)
     * Сообщения о перенаправлении (300 – 399)
     * Ошибки клиента (400 – 499)
     * Ошибки сервера (500 – 599)
     */

    /** Что тестируется?
     * Заголовок Header
        * Заголовки из документации работают (в целом)
        * А если какой-то не передать? (обязательность)
        * А если передать, но неправильно? (текст ошибки)
        * Позитивные тесты по доке
        * Регистронезависимость заголовков

     * Тело запроса (body)
        * Правильное тело (пример)
        * Различные параметры (обязательность, работа параметров)
        * Бизнес-логика (Допустимые для продукта данные согласно бизнес требованиям)
        * Ошибки: бизнес-логика (Недопустимые - ошибочные)
        * Перестановка мест слагаемых
        * Регистрозависимость
        * Ошибки: не well formed xml / json

     */
}
