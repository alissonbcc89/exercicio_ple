package questao4;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().ordinal());
		System.out.println("Mes: " + localDate.getMonthValue());
		System.out.println("Mes: " + localDate.getMonth().name());
		System.out.println("Ano: " + localDate.getYear());
		
		
		long instateInicial = System.currentTimeMillis();
		try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {
		       e.printStackTrace();
		}
		long instanteFinal = System.currentTimeMillis();
		long duracaoEmMilesegundos = instanteFinal - instateInicial;
		System.out.println("Duração em segundos: " +
		( duracaoEmMilesegundos / 1000 ) % 60 );
		
		Instant iInicial = Instant.now();
		try {
		       Thread.sleep(1000);
		} catch (InterruptedException e) {
		       e.printStackTrace();
		}
		Instant iFinal = Instant.now();

		Duration duracao = Duration.between(iInicial, iFinal);

		System.out.println("Duração em nanos segundos: " + duracao.toNanos());
		System.out.println("Duração em minutos: " + duracao.toMinutes());
		System.out.println("Duração em horas: " + duracao.toHours());
		System.out.println("Duração em milisegundos: " + duracao.toMillis());
		System.out.println("Duração em dias: " + duracao.toDays());
		
		
		
		LocalDate localDateAntigo = LocalDate.of(2010, 3, 7);
		LocalDate localDateNovo = LocalDate.of(2015, 3,5);

		System.out.println(localDateAntigo.isAfter(localDateNovo));
		System.out.println(localDateAntigo.isBefore(localDateNovo));
		System.out.println(localDateAntigo.isEqual(localDateNovo));

		Period periodo = Period.between(localDateAntigo, localDateNovo);
		System.out.println(periodo.getYears() + " Anos " + periodo.getMonths() + " Meses " + periodo.getDays() + " Dias");
		System.out.println("Apenas meses: " + periodo.toTotalMonths());
		
		
		
		LocalDate dataManipulacao = LocalDate.now();
		System.out.println("Mais 5 dias:" + dataManipulacao.plusDays(5));
		System.out.println("Mais 5 semanas:" + dataManipulacao.plusWeeks(5));
		System.out.println("Mais 5 anos:" + dataManipulacao.plusYears(5));
		System.out.println("Mais 2 meses:" + dataManipulacao.plusMonths(2));
		System.out.println("Menos 1 ano:" + dataManipulacao.minusYears(1));
		System.out.println("Menos 1 mês:" + dataManipulacao.minusMonths(1));
		System.out.println("Menos 3 dia: " + dataManipulacao.minusDays(3));
		System.out.println("Data Original:" + dataManipulacao);
		
		
		LocalDateTime hora = LocalDateTime.of(2016, Month.APRIL, 4, 22, 30);

		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime horaSaoPaulo = ZonedDateTime.of(hora, fusoHorarioDeSaoPaulo);
		System.out.println(horaSaoPaulo);

		ZoneId fusoHorarioDeParis = ZoneId.of("Europe/Paris");
		ZonedDateTime horaParis = ZonedDateTime.of(hora, fusoHorarioDeParis);
		System.out.println(horaParis);

		Duration diferencaDeHoras = Duration.between(horaSaoPaulo, horaParis);
		System.out.println(diferencaDeHoras.getSeconds() / 60 / 60);
		
		
		
		
		
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorTraco = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		System.out.println("Data com /: " + hoje.format(formatadorBarra));
		System.out.println("Data com -: " + hoje.format(formatadorTraco));
		
		
		
		
		LocalDate data = LocalDate.now();

		System.out.println("Ano bissexto: " + data.isLeapYear());
		System.out.println("Número de dias do mês: " + data.lengthOfMonth());
		System.out.println("Número de dias do ano: " + data.lengthOfYear());
		System.out.println("Menor data: " + LocalDate.MIN);
		System.out.println("Maior data: " + LocalDate.MAX);
		
		
		
		//Inicio desafio
		
		System.out.println("Digite uma data no formato dd/mm/aaaa");

	}

}
