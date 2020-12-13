package questao3;

public class TesteEstoqueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto produto1 = new Produto(01,"Teclado");
		Produto produto2 = new Produto(02, "Mouse");
		Estoque estoque1 = new Estoque(produto1,20,15);
		Estoque estoque2 = new Estoque(produto2,20,10);
		
// Dar baixa em dez unidades
		estoque1.darBaixa(10);
		System.out.println(estoque1.getQuantidadeAtual());
		
		
		
		
		System.out.println(estoque2.getQuantidadeAtual());
		
//Fazer a reposição de 19 unidades
		estoque2.setQuantidadeAtual(19);
		System.out.println(estoque2.getQuantidadeAtual());
		
//Executar o método relatorio das instâncias estoque1 e estoque2; 
		System.out.println(estoque1.toString());
		System.out.println(estoque2.toString());
		
//Mudar o nome do produto01 para "Teclado virtual";
		produto1.setNome("Teclado Virtual");
		System.out.println(produto1.getNome());
		
// Executar o método relatorio da instância de estoque responsável pelo atributo produto02
		System.out.println(estoque2.getProduto().toString());
		
		
		
	}

}
