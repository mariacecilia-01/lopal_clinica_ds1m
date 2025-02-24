package br.sp.senai.jandira.clinica;

import java.time.LocalDate;

import br.sp.senai.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		System.out.println(p1);
		
		Paciente p2 = new Paciente ();
		System.out.println(p2);
		
		p1.setNome("Ana Maria");
		p1.setPeso(68);
		p1.setAltura(1.66);
		p1.setGenero("f");
		p1.setTelefone("(11)95554-3321");
		p1.setDataNascimento (LocalDate.of(1979, 2, 28));
		
		p2.setNome("Jó da Silva");
		p2.setPeso(83);
		p2.setAltura(1.67);
		p2.setGenero("m");
		p2.setTelefone("(13)98754-3210");
		
		p1.exibirDados();
		p2.exibirDados();
		
		System.out.println(p1.getNome().length());
		System.out.println(p1.getNome().toUpperCase());
		System.out.println(p1.getGenero());
		System.out.println(p1.getTelefone());
	

	}
}
