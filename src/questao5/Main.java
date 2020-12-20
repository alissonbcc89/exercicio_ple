package questao5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int id, String nome, String descricao, double preco
		
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Produto p1 = new Produto(1,"Bolacha", "vitarella", 2.00);
		Produto p2 = new Produto(2,"Teclado", "ps2", 20.00);
		Produto p3 = new Produto(3,"Notebook","asus", 5000.00);
		Produto p4 = new Produto(4, "Impressora", "hp", 875);
		
		//int quantidade, Produto produto
		ItemVenda iv1 = new ItemVenda(20, p1);
		ItemVenda iv2 = new ItemVenda(5,p2);
		ItemVenda iv3 = new ItemVenda(1,p3);
		ItemVenda iv4 = new ItemVenda(2,p4);
		
		
		//SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy"); //você pode usar outras máscaras
		//Date dataUsuario=sdf1.parse(21/06/89);
		
		LocalDate localData = LocalDate.of(1989, 3, 7);
		LocalDate dataAtual = LocalDate.now();
		//String cpf, String nome, LocalDate dataNascimento, 
		//DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	//	LocalDate entrada = form.parse(21/06/1989);
		Cliente cliente = new Cliente("000-000-000-47","Alguém", localData );
		
		//LocalDateTime data, String atendente, ArrayList<ItemVenda> itens
		Venda v = new Venda();
		v.adicionarItem(iv1);
		v.adicionarItem(iv2);
		v.adicionarItem(iv3);
		v.setAtendente("menina");
		v.setCliente(cliente);
		
		v.listarItensVenda();
		
		
		
	}

}
