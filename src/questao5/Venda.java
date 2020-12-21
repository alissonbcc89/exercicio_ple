package questao5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Venda {
	
	private Date data;
	private String atendente;
	
	private ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();
	
	private Cliente cliente;
	
	public Venda() {}
	public Venda(String atendente, ArrayList<ItemVenda> itens) {
		

		this.atendente = atendente;
		this.itens = itens;
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

	public void setItens(ItemVenda itens) {
		this.itens.add(itens);
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
	

	Date dataAtual = new Date();
	
	public void listarItensVenda() {
		
		System.out.printf("Data da Venda:",dataAtual);
		System.out.println( "\nCliente:"+ getCliente().getNome() +" | CPF:" + getCliente().getCpf()+" | Idade:"+ getCliente().calcularIdade() + "\nAtendente:" + getAtendente());
		System.out.println("\nNome do Produto |   Preço   |  Quantidade |   Total");
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < this.itens.size(); i++) {
			System.out.printf("\t" + itens.get(i).getProduto().getNome()+" |\t"+ itens.get(i).getProduto().getPreco()+" |\t"+ itens.get(i).getQuantidade()+"\t  |" + itens.get(i).calcularTotal(itens.get(i).getProduto())+"\n");
			
		}
		System.out.println("-----------------------------------------------------");
		System.out.printf("\nTotal da Venda: "+ calcularTotal(this.itens));
	}
	
}