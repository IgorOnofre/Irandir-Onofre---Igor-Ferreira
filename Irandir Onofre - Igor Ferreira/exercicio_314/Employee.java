package exercicio_314;

public class Employee {
	private String nome;
	private String sobreNome;
	private double salarioMensal;
	
	//Construtor
	public Employee(String nome, String sobrenome, double salarioMensal){
		this.nome = nome;
		this.sobreNome = sobrenome;
		
		if(salarioMensal<0){
			this.salarioMensal = (salarioMensal * (-1));
		}else{
			this.salarioMensal = salarioMensal;
		}
	}
	
	
	//setters
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobreNome = sobrenome;
	}
	
	public void setSalarioMensal(double salarioMensal) {
		if(salarioMensal<0){
			this.salarioMensal = (salarioMensal * (-1));
		}else{
			this.salarioMensal = salarioMensal;
		}
	}
	
	
	//getters
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobreNome;
	}
	public double getSalarioMensal() {
		return salarioMensal;
	}
}
