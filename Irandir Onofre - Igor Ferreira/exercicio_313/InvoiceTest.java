package exercicio_313;

public class InvoiceTest {
	public static void main(String[] args) {
		
		Invoice c1 = new Invoice("123", "teclado", 28, 2.35);
		double fatura = c1.InvoiceAmount();
		
		System.out.println("Número: " + c1.getNumero());
		System.out.println("Descrição: " + c1.getDescricao());
		System.out.println("Quantidade de Itens: " + c1.getQuantidadeItem());
		System.out.println("Preço por unidade dos Itens: " + c1.getPreco());
		System.out.println("Valor da fatura: " + c1.InvoiceAmount());
		
		
		
		//Alterando os valores do objeto c1
		c1.setNumero("789");
		c1.setDescricao("Monitor");
		c1.setQuantidadeItem(20);
		c1.serPreco(4.60);
		
		System.out.println("\nNovo número: " + c1.getNumero());
		System.out.println("Nova descrição: " + c1.getDescricao());
		System.out.println("Noava quantidade de Itens: " + c1.getQuantidadeItem());
		System.out.println("Novo preço por unidade dos Itens: " + c1.getPreco());
		System.out.println("Novo valor da fatura: " + c1.InvoiceAmount());
		
	}
}
