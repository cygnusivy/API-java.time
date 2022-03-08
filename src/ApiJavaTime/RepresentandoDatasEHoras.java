package ApiJavaTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

public class RepresentandoDatasEHoras {

	public static void main(String[] args) {
		/* 
		 * LocalDate = representa apenas uma data sem hora
		 * LocalTime = representa apenas uma hora
		 * LocalDateTime = representa uma data com hora
		 * MonthDay = representa um dia do mês, independentemente do ano
		 * YearMonth = representa o mes e ano, tipo julho/2015
		 */
		
		// a partir do momento em que uma data é criada, esta não pode ser modificada
		// mas há metodos que podem alterar a data, o with
		
		// não é possível chamar diretamente o construtor
		// formato de impressao - ano/mês/dia - ISO 8601
		LocalDate d = LocalDate.now();
		System.out.println("A data de hoje é: " + d);
		
		// a hora é representafo em milissegundos 
		// formato de impressar - hora:min:seg.milissegundo -ISO 8601
		LocalTime t = LocalTime.now();
		System.out.println("Hora atual: " + t);
		
		// formato de impressao - dataThora -ISO 8601
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Data e hora de hoje: " + dt);
		
		// fuso horário com a classe ZoneId
		LocalTime t1 = LocalTime.now(ZoneId.of("America/Chicago"));
		LocalTime t2 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
		System.out.println("Horário em Chicago: " + t1);
		System.out.println("Horário em São Paulo: " + t2);
		
		// criar um data em um tempo específico do tempo
		// criando um LocalTime no meio dia
		LocalTime meioDia = LocalTime.of(12, 0, 0); // hora, min e segundo
		
		LocalDate natal2021 = LocalDate.of(2021, 12, 25);
		LocalDate natal2022 = LocalDate.of(2022, Month.DECEMBER, 25);
		
		LocalDateTime comemoracao = LocalDateTime.of(2020, 12, 25, 12, 0, 0);
		
		// unindo uma data e hora já estabelecida anteriormente
		LocalDateTime almocoNatal = LocalDateTime.of(natal2021, meioDia);
		
		// extraindo partes de uma data, como dia, hora, mês e ano
		LocalDateTime ldt = LocalDateTime.of(2001, 05, 04, 22, 45);
		
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getDayOfWeek());
		System.out.println(ldt.getDayOfYear());
		System.out.println(ldt.getHour());
		// ou
		System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));
		System.out.println(ldt.get(ChronoField.DAY_OF_WEEK));
		System.out.println(ldt.get(ChronoField.DAY_OF_YEAR));
	}

}
