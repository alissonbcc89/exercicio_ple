package questao5;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venda {
	
	private LocalDateTime data;
	
	private String atendente;
	
	ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();
	
	

	
	
	
	
	
	
	
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
	

	
	public void listarItensVenda() {}
	
}