package exercicio_313;

public class Invoice {
	private String numero;
	private String descricao;
	private int quantidadeItem;
	private double preco;
	
	//Construtor
	public Invoice (String numero, String descricao, int quantidadeItem, double preco){
		this.numero = numero;
		this.descricao = descricao;
		this.quantidadeItem = quantidadeItem;
		this.preco = preco;
	}
	
	//setters
	public void setNumero(String numero){
		this.numero = numero;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	public void setQuantidadeItem(int quantidadeItem){
		if(quantidadeItem > 0){
			this.quantidadeItem = quantidadeItem;
		}else if(quantidadeItem<0){
			this.quantidadeItem = 0;
		}
	}
	public void serPreco(double preco){
		this.preco = preco;
	}
		
	//getters
	public String getNumero() {
		return numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public int getQuantidadeItem() {
		return quantidadeItem;
	}
	public double getPreco() {
		return preco;
	}
	
	//Fatura
	public double InvoiceAmount(){
		double fatura = quantidadeItem * preco;
		return fatura;
	}
	
}
