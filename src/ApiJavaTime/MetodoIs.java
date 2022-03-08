package ApiJavaTime;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;

public class MetodoIs {

	public static void main(String[] args) {
		MonthDay dia1 = MonthDay.of(1, 1); //01/jan
		MonthDay dia2 = MonthDay.of(2, 3); // 03/mar
		
		// para saber se um dia vem antes do outro
		System.out.println(dia1.isBefore(dia2));
		
		// para saber se um dia vem depois do outro
		System.out.println(dia1.isAfter(dia2));
		
		//para saber se um dia é igual ao outro
		System.out.println(dia1.equals(dia1)); // no curso era apresentado da seguinte forma: dia1.isEquals(dia1)
		
		//modificar uma data
		// o objeto anterior nunca é modificado, é criado outro com outra data
		
		LocalDate data1 = LocalDate.of(2001, 05, 04);
		LocalDate data2 = data1.withMonth(4).withYear(2002).withDayOfMonth(8);

		System.out.println(data1);
		System.out.println(data2);
		
		// é possível também somar e reduzir unidades de tempo das datas
		LocalDate data3 = data2.plusDays(5).plusMonths(2).minusYears(2);
		
		System.out.println(data3);
		
		//ou
		LocalDate data4 = data3.minus(8, ChronoUnit.MONTHS); // chronounit é utilizado para fazer operações. para pegar valor é utuilizada o chronofield (para fazer a leitura)

		System.out.println(data4);
	}

}
