package questao3;

public class Estoque {
	
	private Produto produto;
	private int quantidadeAtual;
	private int quantidadeMinima;
	
	
	
	
	public Estoque() {
		super();
	}


	public Estoque(Produto produto, int quantidadeAtual, int quantidadeMinima) {
		
		this.produto = produto;
		this.quantidadeAtual = quantidadeAtual;
		this.quantidadeMinima = quantidadeMinima;
	}
	
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Produto getProduto() {
		return produto;
	}
	public int getQuantidadeAtual() {
		return quantidadeAtual;
	}
	public void setQuantidadeAtual(int quantidadeAtual) {
		this.quantidadeAtual += quantidadeAtual;
	}
	public void darBaixa(int quantidade)
	{
		this.quantidadeAtual -= quantidade;
	}
	public int getQuantidadeMinima() {
		return quantidadeMinima;
	}
	public void setQuantidadeMinima(int quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}
	
	@Override
	public String toString() {
		return "Estoque [produto=" + produto + ", quantidadeAtual=" + quantidadeAtual + ", quantidadeMinima="
				+ quantidadeMinima + "]";
	}
	
	
	
	
	
}
