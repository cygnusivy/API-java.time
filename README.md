# **API - java.time**

#### Obs: Este tutorial apresenta uma desscrição resumida do pacote java.time baseado no tutorial Java oficial da Oracle. [Clique aqui](https://docs.oracle.com/javase/tutorial/datetime/index.html) para acessar o tutorial oficial.

#### A principal API de datas/horas do java, java.time, foi indroduzida no Java8 e está em conformidade com a [ISO 8601](https://www.iso.org/iso-8601-date-and-time-format.html), norma que estabelece uma forma internacional de padronização das datas, seguindo o padrão AAAA/MM/DD (ano/mês/dia)

#### **Por exemplo** --> A data 16 de março de 2022 seria representada da seguinte forma: 2022/03/16.

#### Esta API pode ser representada de duas formas distintas com relação a representação do tempo: uma forma para máquinas por meio da classe `Instant`, e uma forma para humanos por meio das classes `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateId`, `Period` e `Duration`
