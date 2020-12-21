package questao4;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class Teste {

	
		public static void main(String[] args) {
		try {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite uma data: ");
		String dataRecebida = s.nextLine();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//DateFormat df = new SimpleDateFormat(“dd/MM/yyyy”);
		Date dt = (Date) df.parse(dataRecebida);
		System.out.println(dt);
		} catch (Exception ex) {
		ex.printStackTrace();
		}
		}
		
}
