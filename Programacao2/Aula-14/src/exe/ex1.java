package exe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex1 {

	private JFrame tela;
	private JTextField tfNumA;
	private JTextField tfNumB;
	private JTextField tfSoma;
	private JTextField tfSub;
	private JTextField tfDiv;
	private JTextField tfMulti;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex1 window = new ex1();
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
	public ex1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		tela = new JFrame();
		tela.setTitle("calculadora pai");
		tela.setBounds(100, 100, 450, 300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero A");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(46, 25, 102, 14);
		tela.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero B");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(280, 25, 96, 14);
		tela.getContentPane().add(lblNewLabel_1);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(tfNumA.getText());
				int b = Integer.parseInt(tfNumB.getText());
				int soma = a + b;
				int div = a / b;
				int sub = a - b;
				int multi = a * b;
				
				tfSoma.setText(String.valueOf(soma));
				tfDiv.setText(String.valueOf(div));
				tfSub.setText(String.valueOf(sub));
				tfMulti.setText(String.valueOf(multi));
			}
		});
		btnCalcular.setBounds(172, 87, 89, 23);
		tela.getContentPane().add(btnCalcular);
		
		tfNumA = new JTextField();
		tfNumA.setBounds(42, 46, 86, 20);
		tela.getContentPane().add(tfNumA);
		tfNumA.setColumns(10);
		
		tfNumB = new JTextField();
		tfNumB.setColumns(10);
		tfNumB.setBounds(271, 46, 86, 20);
		tela.getContentPane().add(tfNumB);
		
		JLabel lblSoma = new JLabel("Soma");
		lblSoma.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSoma.setBounds(46, 140, 102, 14);
		tela.getContentPane().add(lblSoma);
		
		JLabel lblMultiplicao = new JLabel("Multiplica\u00E7\u00E3o");
		lblMultiplicao.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMultiplicao.setBounds(46, 191, 102, 14);
		tela.getContentPane().add(lblMultiplicao);
		
		JLabel lblDiferena = new JLabel("Subtra\u00E7\u00E3o");
		lblDiferena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDiferena.setBounds(271, 140, 102, 14);
		tela.getContentPane().add(lblDiferena);
		
		JLabel lblDiviso = new JLabel("Divis\u00E3o");
		lblDiviso.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDiviso.setBounds(271, 193, 102, 14);
		tela.getContentPane().add(lblDiviso);
		
		tfSoma = new JTextField();
		tfSoma.setColumns(10);
		tfSoma.setBounds(46, 160, 86, 20);
		tela.getContentPane().add(tfSoma);
		
		tfSub = new JTextField();
		tfSub.setColumns(10);
		tfSub.setBounds(271, 162, 86, 20);
		tela.getContentPane().add(tfSub);
		
		tfDiv = new JTextField();
		tfDiv.setColumns(10);
		tfDiv.setBounds(271, 208, 86, 20);
		tela.getContentPane().add(tfDiv);
		
		tfMulti = new JTextField();
		tfMulti.setColumns(10);
		tfMulti.setBounds(46, 208, 86, 20);
		tela.getContentPane().add(tfMulti);
	}

}
