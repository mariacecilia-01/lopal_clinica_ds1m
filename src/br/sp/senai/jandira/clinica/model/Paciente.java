package br.sp.senai.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {

	private String nome;
	private double peso;
	private double altura;
	private String genero;
	private String telefone;
	private LocalDate dataNascimento;

	public void setNome(String nome) {
		if (nome.length() > 3) {
			this.nome = nome.toUpperCase();
		} else {
			System.out.println("O nome deve conter mais que 3 caractéres");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setPeso(double peso) {

		if (peso > 0) {
			// verdade
			this.peso = peso;
		} else {
			// falso
			System.out.println("O peso deve ser maior do que ZERO!");
		}

	}

	public double getPeso() {
		return peso;
	}

	public double setAltura(double altura) {

		if (altura > 0.5) {
			// verdade
			this.altura = altura;
		} else {
			// falso
			System.out.println("A altura deve ser maior do que 0,5m");
		}
		return altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setGenero(String genero) {
		if (genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("o")) {
			this.genero = genero.toUpperCase();
		} else {
			System.out.println("O gênero do(a) " + nome + " deve ser M ou F ou O");
		}
	}
	
	public String getGenero() {
		return genero;
	}

	public void setTelefone(String telefone) {
		if (telefone.length() >= 13) {
			this.telefone = telefone;
		} else {
			System.out.println("O número " + telefone + " não é um telefone");
		}
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setDataNascimento (LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void marcarConsulta() {

	}

	public void calcularIdade() {

	}

	public void calcularImc() {
		double imc = peso / altura * altura;

	}

	public void classificarImc() {

	}

	public void exibirDados() {
		String unidadePeso = "Kg.";
		String unidadeAltura = "m.";
		System.out.println("---------------------------");
		System.out.println("dados do paciente".toUpperCase());
		System.out.println("----------------------------");
		System.out.println("nome: " + nome);
		System.out.printf("peso: %s %s.\n", peso, unidadePeso);
		System.out.printf("altura: %s %s. \n", altura, unidadeAltura);
		System.out.println("gênero: " + genero);
		System.out.println("telefone: " + telefone);
		System.out.println("data de nascimento: " + dataNascimento);
		System.out.println("-----------------------------");
		System.out.println("===============================");
	}

}
