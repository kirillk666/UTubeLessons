package Theory;

public class KafkaRabbit {
    /**
     * Kafka - журнал сообщений.
     * Структура:
       1) продюсер (producer) — приложение или процесс, генерирующий и посылающий данные (публикующий сообщение);
       2) потребитель (consumer) — приложение или процесс, который принимает сгенерированное продюсером сообщение;
       3) сообщение — пакет данных, необходимый для совершения какой-либо операции (например, авторизации, оформления покупки или подписки);
       4) брокер — узел передачи сообщения от процесса-продюсера приложению-потребителю;
       5) топик — виртуальное хранилище сообщений (журнал записей) одинакового или похожего содержания, из которого приложение-потребитель извлекает необходимую ему информацию.
     * В упрощенном виде работа Kafka Apache выглядит следующим образом:
       1) Приложение-продюсер создает сообщение и отправляет его на узел Kafka.
       2) Брокер сохраняет сообщение в топике, на который подписаны приложения-потребители.
       3) Потребитель при необходимости делает запрос в топик и получает из него нужные данные.
       4) Сообщения хранятся в Kafka в топиках в виде журнала коммитов — записей, размещенных в строгой последовательности. Их можно только добавлять.
          Удалять или корректировать нельзя. Сообщения хранятся в той последовательности, в которой поступили, их считывание ведется слева направо,
          а отслеживание — по изменению порядкового номера, смещение указателя (offset).
          Брокеры Kafka не обрабатывают записи — только помещают их в топик на кластере. Хранение может длиться в течение определенного периода или до достижения заданного порога.
          Сообщения не кешируются в kafka.
          Каждое сообщение (event или message) в Kafka состоит из ключа, значения, таймстампа и опционального набора метаданных (так называемых хедеров).
          Когда новое сообщение добавляется в топик, на самом деле оно записывается в одну из партиций этого топика.
          Сообщения с одинаковыми ключами всегда записываются в одну и ту же партицию, тем самым гарантируя очередность или порядок записи и чтения.
       5) Если топик слишком разрастается (сообщения в тему могут начать поступать быстрее чем уходить), то для упрощения и ускорения процесса она разделяется на секции (partitions).
          Каждая секция содержит сообщения, сгруппированные по объединяющему признаку.
          Например, массив пользовательских запросов можно сгруппировать по первой букве имени пользователей.
          Так приложению-потребителю не придется просматривать весь топик — только нужную тему, что ускоряет процесс обмена сообщениями.
     * Преимущества Kafka
       1) Отказоустойчивость
          Kafka — распределенная система обмена сообщениями, узлы которой содержатся на нескольких кластерах.
          Принимая сообщение от продюсера, она реплицирует (копирует) его, а копии сохраняет на разных узлах.
          При этом один из брокеров назначается ведущим в секции, через него потребители будут обращаться к записям.
          Другие брокеры остаются ведомыми, их главная задача — обеспечить сохранность сообщения (его копий) даже при выходе одного или нескольких узлов из строя.
          Распределенный характер и механизм репликации записей обеспечивают системе высокую устойчивость.
          Надежность повышает интеграция с Apache ZooKeeper, которая обеспечивает координацию компонентов друг с другом.
       2) Масштабируемость
          Apache Kafka поддерживает «горячее» расширение, то есть ее можно увеличивать с помощью простого добавления новых машин в кластеры, не отключая всю систему.
          Так исключаются простои, связанные с переоборудованием серверных мощностей.
          Принцип удобнее горизонтального масштабирования, при котором на одну серверную машину «навешиваются» дополнительные ресурсы: жесткие диски, CPU, RAM и т.д.
          При необходимости систему можно легко сократить, исключив лишние машины из кластера.
       3) Производительность
          В Kafka процессы генерирования/отправки и считывания сообщений организованы независимо друг от друга.
          Тысячи приложений, процессов могут одновременно и параллельно играть роль генераторов и потребителей сообщений.
          В сочетании с распределенным характером и масштабируемостью это позволяет применять «Кафка» как в небольших, так и в масштабных проектах с большими объемами данных.
       4) Открытый исходный код
       5) Безопасность
          В Kafka есть инструменты, обеспечивающие безопасную работу и достоверность данных. Например, настроив уровень изоляции для транзакций, можно исключить чтение незавершенных или отмененных сообщений.
          Кроме того, благодаря сохранению данных в топиках пользователь может в любой момент отследить изменения в системе. А принцип последовательной записи позволяет быстро находить нужные сообщения.
       6) Долговечность
          Данные в Kafka сохраняются в долговременные виртуальные хранилища в течение заданного периода времени (дней, недель, месяцев).
          За счет распределенного хранения информации она не потеряется при сбое одного или нескольких узлов, и потребитель сможет в любой момент обратиться к нужному сообщению в топике, отследив его смещение.
       7) Интегрируемость
          Благодаря собственному протоколу на базе TCP «Кафка Апач» взаимодействует с другими протоколами передачи данных (REST, HTTP, XMPP, STOMP, AMQP, MQTT).
          Встроенный фреймворк Kafka Connect позволяет Kafka подключаться к базам данных, файловым и облачным хранилищам.
     * Используется pull-модель - консьюмеры сами отправляют запрос раз в n секунд на сервер для получения новой порции сообщений.
       При таком подходе клиенты могут эффективно контролировать собственную нагрузку. Кроме того, pull-модель позволяет группировать сообщения в батчи, таким образом достигая лучшей пропускной способности.
       К минусам модели можно отнести потенциальную разбалансированность нагрузки между разными консьюмерами, а также более высокую задержку обработки данных.
     * Единственный заметный недостаток системы — ориентированность на обработку больших объемов данных.
     * Из-за этого функционал маршрутизации потоков ограничен по сравнению с другими аналогичными платформами. По мере развития Kafka это различие становится менее заметным
     *
     * Для получения ответа  есть два основных способа:
     * 1) обычное асинхронное взаимодействие, когда передающая система сама периодически опрашивает состояние документа;
     * Такой асинхронный способ легко превращается в синхронный — достаточно в методе отправки сообщения поставить таймер с опросом результата.
     * 2) реактивное, при котором принимающая система вызывает callback или отправляет сообщение о результате обработки заданному в исходном запросе адресату.
     */

    /**
     *   RabbitMQ - брокер сообщений
     * Используется push-модель — сервер делает запрос к клиенту, посылая ему новую порцию данных.
     Она снижает задержку обработки сообщений и позволяет эффективно балансировать распределение сообщений по консьюмерам.
     Но для предотвращения перегрузки консьюмеров в случае с RabbitMQ клиентам приходится использовать функционал QS, выставляя лимиты.
     /*

     /**
     * Итогово: основные отличия Kafka от RabbitMQ
     * 1) Сообщения в Kafka не удаляются брокерами по мере их обработки консьюмерами — данные в Kafka могут храниться днями, неделями, годами.
     *    Благодаря этому одно и то же сообщение может быть обработано сколько угодно раз разными консьюмерами и в разных контекстах.
     * 2) Производительность RabbitMQ от 4000 до 10 000 сообщений в секунду, Kafka - 1 миллион сообщений в секунду.
     * 3) RabbitMQ push-модель, Kafka pull-модель
     * 4) Примеры применения. RabbitMQ - простые случаи, Kafka - массовая обработка данных/высокопроизводительная передача данных.
     * 5) Топология. RabbitMQ использует топологию обмена очереди: сообщения отправляются на обмен, откуда затем рассылаются в различные привязки очередей для использования консьюмерами.
     * Кафка использует топологию Publish/Subscribe, отправляя сообщения через поток в соответствующие топики, которые затем потребляются пользователями в разных авторизованных группах.
     */

}