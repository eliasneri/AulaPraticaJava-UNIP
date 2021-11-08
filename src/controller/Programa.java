package controller;

import javax.swing.JOptionPane;

import model.Pessoa;
import view.TelaCadastroPessoa;

public class Programa implements IOuvinteBotao{

	public static void main(String[] args) {
		
		TelaCadastroPessoa tela = new TelaCadastroPessoa(new Programa());
			tela.setVisible(true);
	}
	
	public void GravaPessoa(Pessoa p) {
		JOptionPane.showMessageDialog(null, "A Pessoa: " + p.getNome() + " e Telefone: " +
									  p.getTelefone() + "Foi Cadastrada!");
	}

}
