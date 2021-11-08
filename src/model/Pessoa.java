package model;

public class Pessoa {
	
	private String nome;
	private int telefone;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, int telefone) {
		setNome(nome);
		setTelefone(telefone);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (!nome.equals("")) {
			this.nome = nome;	
		} else {
			throw new IllegalArgumentException("O Nome não pode ser vazio!");
		}

	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		if (telefone >= 10000000) {
			this.telefone = telefone;
		} else {
			throw new IllegalArgumentException("Telefone Inválido");
		}
		
	}
	
	

}
