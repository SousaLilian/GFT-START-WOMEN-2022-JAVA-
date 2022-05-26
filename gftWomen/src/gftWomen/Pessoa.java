package gftWomen;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	private String nome;
	private String genero;
	private String corDoOlho;
	private String corDoCabelo;
	private LocalDate dataNascimento;
	private String tipoSanguineo;
	private String fatorRh;

	public Pessoa(String nome, String genero, String corDoOlho, String corDoCabelo, LocalDate dataNascimento,
			String tipoSanguineo, String fatorRh) {
		this.nome = nome;
		this.genero = genero;
		this.corDoOlho = corDoOlho;
		this.corDoCabelo = corDoCabelo;
		this.dataNascimento = dataNascimento;
		this.tipoSanguineo = tipoSanguineo;
		this.fatorRh = fatorRh;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCorDoOlho() {
		return corDoOlho;
	}

	public void setCorDoOlho(String corDoOlho) {
		this.corDoOlho = corDoOlho;
	}

	public String getCorDoCabelo() {
		return corDoCabelo;
	}

	public void setCorDoCabelo(String corDoCabelo) {
		this.corDoCabelo = corDoCabelo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getFatorRh() {
		return fatorRh;
	}

	public void setFatorRh(String fatorRh) {
		this.fatorRh = fatorRh;
	}

	public int idade(LocalDate dataNascimento, LocalDate diaParaCalcular) {
		final Period periodo = Period.between(dataNascimento, diaParaCalcular);
		return periodo.getYears();
	}

	public String probabilidadeCorDoOlhoBebe(Pessoa masculino, Pessoa feminino) {
		String result = "";
		if (masculino.getCorDoOlho().equalsIgnoreCase("Castanho")
				&& (feminino.getCorDoOlho().equalsIgnoreCase("Castanho"))) {
			result = "75% castanho/19% verdes/6% azuis";
		} else if (masculino.getCorDoOlho().equalsIgnoreCase("Verde")
				&& (feminino.getCorDoOlho().equalsIgnoreCase("Castanho"))) {
			result = "50% castanho/37% verdes/12% azuis";
		} else if (masculino.getCorDoOlho().equalsIgnoreCase("Verde")
				&& (feminino.getCorDoOlho().equalsIgnoreCase("Castanho"))) {
			result = "50% castanho/37% verdes/12% azuis";
		} else if (masculino.getCorDoOlho().equalsIgnoreCase("Azul")
				&& (feminino.getCorDoOlho().equalsIgnoreCase("Castanho"))) {
			result = "50% castanho/0% verdes/50% azuis";
		} else if (masculino.getCorDoOlho().equalsIgnoreCase("Verde")
				&& (feminino.getCorDoOlho().equalsIgnoreCase("Verde"))) {
			result = "-1% castanho/75% verdes/25% azuis";
		} else {
			result = "0% castanho/50% verdes/50% azuis";
		}
		return result;
	}
}