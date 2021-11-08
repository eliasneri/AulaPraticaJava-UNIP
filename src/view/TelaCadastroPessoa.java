package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.IOuvinteBotao;
import model.Pessoa;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroPessoa extends JFrame {

	private IOuvinteBotao ouvinteBotao;
	
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTelefone;

	/**
	 * Launch the application.
	 */
	
	/*
	 public static void main(String[] args) {
	 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroPessoa frame = new TelaCadastroPessoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the frame.
	 */
	
	public TelaCadastroPessoa(IOuvinteBotao ouvinteBotao) {
		this();
		this.ouvinteBotao = ouvinteBotao;
	}
	
	private void Cadastra() {
		String nome = txtNome.getText();
		int telefone = Integer.parseInt(txtTelefone.getText());
		Pessoa pessoa = new Pessoa(nome, telefone);
		ouvinteBotao.GravaPessoa(pessoa);
	}
	
	
	private TelaCadastroPessoa() {
		setTitle("Cadastro Pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(79, 34, 235, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(21, 37, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setBounds(21, 73, 46, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(79, 70, 235, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JButton btCadastro = new JButton("Cadastrar");
		btCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastra();
			}
		});
		btCadastro.setBounds(143, 122, 89, 23);
		contentPane.add(btCadastro);
	}
}
