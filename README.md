# **API - java.time**

#### Obs: Este tutorial apresenta uma desscrição resumida do pacote java.time baseado no tutorial Java oficial da Oracle. [Clique aqui](https://docs.oracle.com/javase/tutorial/datetime/index.html) para acessar o tutorial oficial.

#### A principal API de datas/horas do java, java.time, foi indroduzida no Java8 e está em conformidade com a [ISO 8601](https://www.iso.org/iso-8601-date-and-time-format.html), norma que estabelece uma forma internacional de padronização das datas, seguindo o padrão `AAAA/MM/DD` (ano/mês/dia)

#### **Por exemplo** --> A data 16 de março de 2022 seria representada da seguinte forma: 2022/03/16.

#### Esta API pode ser representada de duas formas distintas com relação a representação do tempo: uma forma para máquinas por meio da classe `Instant`, e uma forma para humanos por meio das classes `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateId`, `Period` e `Duration`.

## **Descrição**

#### `Instant` - Representa um momento específico (data e hora) na linha do tempo, em UTC (Coordinated Universal Time).

#### `LocalDate` - Representa uma data sem fuso horário no sistema de calendário ISO-8601, como 2022-03-16 (ano/mês/dia).
#### Para criar uma instância que representa uma data, como a data de hoje, por exemplo, poderíamos representar da sequinte forma: 
```
LocalDate localDate = LocalDate.now
```
#### Do mesmo modo, é possível representar uma data específica com ano, mês e dia através do método estático `of` da seguinte forma:
```
LocalDate.of(2022, 03, 16);
LocalDate.parse("2022-03-16")
```
### Alguns métodos com a classe `LocalDate`:
#### Para informar o dia da semana: `DayOfWeek monday = LocalDate.parse("2022-03-16").getDayOfWeek();
#### Para verificar se o ano é bissexto: 
boolean leapYear = LocalDate.now()isLeapYear();

#### `LocalTime` - Representa uma hora sem fuso horário no sistema de calendário ISO-8601 yyyy-MM-dd, como 10:15:30 (hora/minutos/segundos).

#### `LocalDateTime` - Representa uma data e hora sem fuso horário no sistema de calendário ISO-8601, como 2007-12-03T10:15:30 (data**T**hora). Podemos representar a data e hora da seguinte forma:
```
LocalDateTime.of(2022, Month.MARS, 16, 22, 30);
LocalDateTime.parse("2022-03-16T22:30:00");
```
#### No Primeiro código acima, a data/hora `2022, Month.MARS, 16, 22, 30` segui o padrão ano/mês/dia/hora/minuto.

#### `ZonedDateId` - Representa uma data e hora com um zona defuso horário específica no sistema de calendário ISO-8601, como 2007-12-03T10:15:30+01:00 Europe/Paris. Há dezenas de fuso-horários e podem se representados e acessados facilmente da seguinte maneira:
```
ZonedId zoneId = ZonedId.of("Europe/Paris");
```
#### Para representar uma data e hora em determinada zona do fuso-horário:
```
ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
```

#### `Period` - Representa uma quantidade de tempo baseada em data no sistema de calendário ISO-8601, como '2 anos, 3 meses e 4 dias'.

#### `Duration` - Representa uma quantidade de tempo baseada em tempo, como '34,5 segundos'.
