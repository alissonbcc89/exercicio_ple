package questao3;

public class Produto {
	
	private int codigo;
	private String nome;
	
	public Produto() {
		super();
	}
	
	public Produto(int c, String n)
	{
		this.codigo = c;
		this.nome = n;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + "]";
	}
	
	

}
