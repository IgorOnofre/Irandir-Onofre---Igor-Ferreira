package exercicio_316;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HeartRates {

	private String nome;
	private String sobreNome;
	private String data;
	private int idade;

	public HeartRates(String nome, String sobreNome, String data) {
		this.data = data;
		this.nome = nome;
		this.sobreNome = sobreNome;

	}

	public int frequenciaCardiacaMaxima() {
		return 220 - idade;
	}

	public String frequenciaCardiacaAlvo() {
		int alvo = frequenciaCardiacaMaxima();
		// alvo _ 100
		// x _ 50
		int pocentagem_50 = alvo * 50 / 100;
		int pocentagem_85 = alvo * 85 / 100;
		return "Sua frequência cardíaca alvo é entre " + pocentagem_50 + "-"
				+ pocentagem_85;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int idade() {
		Date horaAtual = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
		int ano = Integer.parseInt(sdf.format(horaAtual).toString());
		String[] nascimento = data.split("/");
		idade = ano - Integer.parseInt(nascimento[2]);
		return idade;
	}

}
