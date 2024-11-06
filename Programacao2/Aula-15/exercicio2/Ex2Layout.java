package exercicio2;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.awt.event.ActionEvent;

public class Ex2Layout {
	
	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfIdade;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {			
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2Layout window = new Ex2Layout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ex2Layout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(187, 11, 237, 239);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 16, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCpf.setBounds(10, 53, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		JLabel lblIdade = new JLabel("Idade: ");
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdade.setBounds(10, 91, 46, 14);
		frame.getContentPane().add(lblIdade);
		
		tfNome = new JTextField();
		tfNome.setBounds(66, 13, 86, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		tfCPF = new JTextField();
		tfCPF.setColumns(10);
		tfCPF.setBounds(66, 50, 86, 20);
		frame.getContentPane().add(tfCPF);
		
		tfIdade = new JTextField();
		tfIdade.setColumns(10);
		tfIdade.setBounds(66, 88, 86, 20);
		frame.getContentPane().add(tfIdade);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = tfNome.getText();
				String cpf = tfCPF.getText();
				String idade = tfIdade.getText();
				
				pessoas.add(new Pessoa(nome, cpf, idade));
				
				textArea.append(nome + " - " + cpf + " - " + idade + "\n");
				
				tfNome.setText("");
				tfCPF.setText("");
				tfIdade.setText("");
			}
		});
		btnInserir.setBounds(32, 119, 89, 23);
		frame.getContentPane().add(btnInserir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pessoas.removeAll(pessoas);
				textArea.setText("");
			}
		});
		btnLimpar.setBounds(32, 153, 89, 23);
		frame.getContentPane().add(btnLimpar);
		
		JButton btnGravarEmArquivo = new JButton("Gravar em arquivo");
		btnGravarEmArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File dir = new File("Pessoas");
				dir.mkdir();
				
				File arquivo = new File("Pessoas/arquivo.txt");
				try {
					arquivo.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					FileWriter escritor = new FileWriter(arquivo,true);
					BufferedWriter buffer = new BufferedWriter(escritor);
					
					for (int i = 0; i < pessoas.size(); i++) {
						buffer.write(pessoas.get(i).getNome() + " - " + pessoas.get(i).getCpf() + " - " + pessoas.get(i).getIdade() + " \n ");
					}	
					
					buffer.close();
					escritor.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnGravarEmArquivo.setBounds(10, 187, 142, 23);
		frame.getContentPane().add(btnGravarEmArquivo);
		
		JButton btnRecuperarEmArquivo = new JButton("Recuperar em arquivo");
		btnRecuperarEmArquivo.setBounds(10, 219, 142, 23);
		frame.getContentPane().add(btnRecuperarEmArquivo);
	}

}
