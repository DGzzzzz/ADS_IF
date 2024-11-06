package exercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class ExemploLayout1 {
	
	private ArrayList<Banda> bandas = new ArrayList<Banda>();

	private JFrame frame;
	private JPanel menu;
	private JPanel cadastrar;
	private JPanel consultar;
	private JTextField ipNome;
	private JTextField ipEstilo;
	private JTextArea listaBandas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploLayout1 window = new ExemploLayout1();
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
	public ExemploLayout1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 585, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		menu = new JPanel();
		menu.setBackground(Color.WHITE);
		menu.setForeground(Color.BLACK);
		frame.getContentPane().add(menu, "name_9852337081400");
		
		JButton btnToCadastrar = new JButton("Cadastrar");
		btnToCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(cadastrar);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();				
			}
		});
		menu.add(btnToCadastrar);
		
		JButton btnToConsultar = new JButton("Consultar");
		btnToConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(consultar);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();	
				
				for (int i = 0; i < bandas.size(); i++) {
					String nome = bandas.get(i).getNome();
					String estilo = bandas.get(i).getEstilo();
					
					listaBandas.append(nome + " - " + estilo + "\n");
				}
			}
		});
		menu.add(btnToConsultar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(btnSair);
		
		cadastrar = new JPanel();
		cadastrar.setBackground(Color.WHITE);
		cadastrar.setForeground(Color.BLACK);
		frame.getContentPane().add(cadastrar, "name_9949146332100");
		cadastrar.setLayout(null);
		
		ipNome = new JTextField();
		ipNome.setFont(new Font("Tahoma", Font.ITALIC, 9));
		ipNome.setBounds(95, 42, 199, 20);
		cadastrar.add(ipNome);
		ipNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNome.setBounds(25, 45, 46, 14);
		cadastrar.add(lblNome);
		
		JLabel lblEstilo = new JLabel("Estilo: ");
		lblEstilo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEstilo.setBounds(25, 76, 46, 14);
		cadastrar.add(lblEstilo);
		
		ipEstilo = new JTextField();
		ipEstilo.setFont(new Font("Tahoma", Font.ITALIC, 9));
		ipEstilo.setColumns(10);
		ipEstilo.setBounds(95, 73, 199, 20);
		cadastrar.add(ipEstilo);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeBanda = ipNome.getText();
				String estiloBanda = ipEstilo.getText();
				
				bandas.add(new Banda(nomeBanda, estiloBanda));
				
				ipNome.setText("");
				ipEstilo.setText("");
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSalvar.setBounds(51, 101, 89, 23);
		cadastrar.add(btnSalvar);
		
		JLabel lblNewLabel = new JLabel("Cadastro de bandas");
		lblNewLabel.setBounds(25, 11, 269, 14);
		cadastrar.add(lblNewLabel);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(menu);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();	
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVoltar.setBounds(150, 101, 89, 23);
		cadastrar.add(btnVoltar);
		
		consultar = new JPanel();
		consultar.setBackground(Color.WHITE);
		consultar.setForeground(Color.BLACK);
		frame.getContentPane().add(consultar, "name_9951432507200");
		consultar.setLayout(null);
		
		listaBandas = new JTextArea();
		listaBandas.setBounds(83, 41, 436, 209);
		consultar.add(listaBandas);
		
		JLabel lblNewLabel_1 = new JLabel("Lista de bandas");
		lblNewLabel_1.setBounds(243, 16, 179, 14);
		consultar.add(lblNewLabel_1);
		
		JButton btnVoltar2 = new JButton("Voltar");
		btnVoltar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(menu);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();	
				listaBandas.setText("");
			}
		});
		btnVoltar2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnVoltar2.setBounds(10, 225, 74, 25);
		consultar.add(btnVoltar2);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
