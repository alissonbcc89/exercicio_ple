package questao5;

import java.time.LocalDateTime;

public class Cliente {
	
	private String cpf;
	private String nome;
	private LocalDateTime dataNascimento;
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
	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public int calcularIdade() {
		// pegar data de nascimento e subtrair do ano atual
		int idade = 0;
		return idade;
	}
	
	

}
