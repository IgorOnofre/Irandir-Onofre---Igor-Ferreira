package exercicio_313;

public class InvoiceTest {
	public static void main(String[] args) {
		
		Invoice c1 = new Invoice("123", "teclado", 28, 2.35);
		double fatura = c1.InvoiceAmount();
		
		System.out.println("N�mero: " + c1.getNumero());
		System.out.println("Descri��o: " + c1.getDescricao());
		System.out.println("Quantidade de Itens: " + c1.getQuantidadeItem());
		System.out.println("Pre�o por unidade dos Itens: " + c1.getPreco());
		System.out.println("Valor da fatura: " + c1.InvoiceAmount());
		
		
		
		//Alterando os valores do objeto c1
		c1.setNumero("789");
		c1.setDescricao("Monitor");
		c1.setQuantidadeItem(20);
		c1.serPreco(4.60);
		
		System.out.println("\nNovo n�mero: " + c1.getNumero());
		System.out.println("Nova descri��o: " + c1.getDescricao());
		System.out.println("Noava quantidade de Itens: " + c1.getQuantidadeItem());
		System.out.println("Novo pre�o por unidade dos Itens: " + c1.getPreco());
		System.out.println("Novo valor da fatura: " + c1.InvoiceAmount());
		
	}
}
