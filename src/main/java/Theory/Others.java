package Theory;

public class Others {
    /**
     * В чем разница между монолитной архитектурой и архитектурой микросервисов?
     * Монолитная:
       Одна база кода используется для выполнения нескольких бизнес-функций;
       Компоненты сильно взаимосвязаны;
       Модификация возможна лишь частично и занимает много времени, т.к. даже небольшие изменения затрагивают большие области базы кода;
       Требует меньше планирования на начальном этапе, но сложность понимания и поддержки постепенно растет;
       Нужно масштабировать все приложение целиком.

     * Микросервисы
       ПО состоит из небольших независимых компонентов (сервисов), каждый развернут в своем контейнере;
       Поскольку они работают независимо, можно обновлять, изменять, развертывать или масштабировать каждый сервис отдельно по мере необходимости;
       Микросервисы взаимодействуют друг с другом через API, а не через встроенные механизмы языка программирования;
       Требует больше планирования и инфраструктуры на начальном этапе, но со временем управление и обслуживание упрощаются;
       Можно масштабировать отдельные сервисы, что снижает затраты на масштабирование.
     */

    /**
     * 3rd party data – это данные, которые закупаются у внешних источников информации.
     * Сквозное тестирование (End-to-end, E2E, Chain testing) — это вид тестирования, используемый для проверки программного обеспечения от начала до конца, а также его интеграцию с внешними интерфейсами.
       Он должен имитировать валидный сценарий, отражающий поведение реального пользователя, который использует созданный нами продукт для достижения определенной цели.
       e2e-тесты намеренно кросс-функциональны – они прыгают от одной функциональности к другой, иногда – даже с помощью внешних приложений или ресурсов
       (почтовый агент для проверки получения верификационного письма, и т. д.).
       Если ваш тест задействует только одну функциональность – то он скорее функциональный, а не end-to-end.
       Если проводится, то после Системного.

     * Пирамида тестирования - каждый этап тестирования дороже и занимает больше времени, цена бага растет очень значительно. Уменьшается изоляция, увеличивается интеграция.
     *      1) Юнит-тестирование - проверка кода в коде, небольшие тесты.
     *      2) Интеграционное тестирование - тестирование взаимодействия между сервисами (модулями)
            Сервис может хорошо работать сам по себе, но сбоить при взаимодействии с другим
            Самый распространенный пример - несоответствие типов данных, ошибки при передаче/приеме данных
            Сторонние (3rd-party) сервисы и API могут получать некорректные внешние данные и соответственно выдавать некорректные ответы.
     *      3) Системное
     *      4) Приемочное
     * Писать тесты разной детализации.
     * Чем выше уровень, тем меньше тестов.
     *
     */
}
