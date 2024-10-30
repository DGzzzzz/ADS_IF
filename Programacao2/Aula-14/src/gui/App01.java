package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class App01 {

	private JFrame tela;
	private JTextField tfNome;
	private JTextArea taNomes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App01 window = new App01();
					window.tela.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		tela = new JFrame();
		tela.setTitle("Programa");
		tela.setBounds(100, 100, 789, 489);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 24, 63, 24);
		tela.getContentPane().add(lblNewLabel);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfNome.setBounds(67, 28, 260, 20);
		tela.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		JButton btnButton = new JButton("Submit");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taNomes.append(tfNome.getText() + " \n");
			}
		});
		btnButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnButton.setBounds(238, 59, 89, 23);
		tela.getContentPane().add(btnButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(434, 11, 329, 416);
		tela.getContentPane().add(scrollPane);
		
		taNomes = new JTextArea();
		scrollPane.setViewportView(taNomes);
	}
}
