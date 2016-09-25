package exercicio_317;
import exercicio_316.*;

public class HealthProfile {
	private String nome;
	private String sobrenome;
	private String sexo;
	private int diaN;
	private int mesN;
	private int anoN;
	private float altura;
	private float peso;
	private HeartRates a;
	private int idade;
	
	//Construtor
	public HealthProfile(String nome, String sobrenome, String sexo,
			int diaNascimento, int mesNascimento, int anoNascimento,
			float altura, float peso) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.diaN = diaNascimento;
		this.mesN = mesNascimento;
		this.anoN = anoNascimento;
		this.altura = altura;
		this.peso = peso;
		a = new HeartRates(nome, sobrenome, (diaN+"/"+mesN+"/"+anoN));
		idade = a.idade();
		
	}
	
	
	//getters
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String getSexo() {
		return sexo;
	}
	public int getDiaNascimento() {
		return diaN;
	}
	public int getMesNascimento() {
		return mesN;
	}
	public int getAnoNascimento() {
		return anoN;
	}
	public float getAltura() {
		return altura;
	}
	public float getPeso() {
		return peso;
	}
	
	
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setDiaNascimento(int diaNascimento) {
		this.diaN = diaNascimento;
	}
	public void setMesNascimento(int mesNascimento) {
		this.mesN = mesNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoN = anoNascimento;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	//Métodos Operatórios
	//calcular IMC
	public double IMC(float peso, float altura){
		float imcRetorno = peso / (altura*altura);
		return imcRetorno;
	}

	//Motrara Dados
	public void mostrarDados(){
		System.out.println("\nNome: " + this.nome);
		System.out.println("Sobrenome: " + this.sobrenome);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Data de nascimento: " + this.diaN + "/"
				+ this.mesN + "/" + this.anoN);
		System.out.println("Altura: " + this.altura + " mts");
		System.out.println("Peso: " + this.peso + " kg");
		
		System.out.println("Idade: " + idade);
		System.out.println("IMC: " + IMC(this.peso, this.altura));
		System.out.println("Frequência cardíaca máxima: " + a.frequenciaCardiacaMaxima());
		System.out.println(a.frequenciaCardiacaAlvo());
		
	}
}
