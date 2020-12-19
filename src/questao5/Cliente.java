package questao5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Cliente {
	
	private String cpf;
	private String nome;
	private LocalDate dataNascimento;
	private String retornoData;
	LocalDate dataManipulacao = LocalDate.now();
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
	
	
	
	
	public Cliente(String cpf, String nome, LocalDate dataNascimento) {
		
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	//String strLocalDate2   = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//	String strLocalDateTime2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	//String strLocalTime2   = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	
	public int calcularIdade() {
		Period idade = Period.between(this.dataManipulacao,this.getDataNascimento());
		
		
		int id = idade.getYears(); // idade.getMonths() + " Meses " + idade.getDays() + " Dias");
		return id;
	}
	
	
	public void setRetornoData(LocalDate dn) {
		
		this.dataNascimento = dn;
	}
	
	

}
