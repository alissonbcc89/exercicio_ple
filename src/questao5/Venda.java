package questao5;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venda {
	
	private LocalDateTime data;
	
	private String atendente;
	
	private ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();
	
	private Cliente cliente;
	
	
	public Venda(LocalDateTime data, String atendente, ArrayList<ItemVenda> itens) {
		
		this.data = data;
		this.atendente = atendente;
		this.itens = itens;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}
	
	
	
	public ArrayList<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemVenda> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double calcularTotal(ArrayList<ItemVenda> soma) {
		
		double aux = 0.0;
		
		for(int i = 0; i < soma.size(); i++) {
			
			aux += soma.get(i).calcularTotal(soma.get(i).getProduto());
			
		}
		return aux;
		
		
	}
	


	public void adicionarItem(ItemVenda item)
	{
		itens.add(item);
		
		
		
	}
	

	
	public void listarItensVenda() {
		
		System.out.printf("Data da Venda:", data, "/nCliente:"+ this.cliente +" | CPF:" + this.cliente.getCpf()+" | Idade:"+ this.cliente.calcularIdade() + "\nAtendente:" + this.atendente);
		
		System.out.println("Nome do Produto |   Preço   |  Quantidade |   Total");
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < this.itens.size(); i++) {
			System.out.print(itens.get(i).getProduto().getNome()+" | "+ itens.get(i).getProduto().getPreco()+" | "+ " | " +  itens.get(i).getQuantidade() + " | " + itens.get(i).calcularTotal(itens.get(i).getProduto()));
			
		}
		System.out.printf("Total da Venda: ", this.calcularTotal(this.getItens()));
	}
	
}