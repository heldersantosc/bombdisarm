// Tela Inicial
package janelas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class telaInicial extends JFrame {
	 String endereco = System.getProperty("user.dir");
	
//método construtor
	public telaInicial() {
		setSize(840,620);
		setTitle("Desarme a Bomba");
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		
		
//Botao iniciar Inicio
		JButton btnNewButton = new JButton("IN\u00CDCIO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Explicacao().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 24));
		btnNewButton.setToolTipText("");
		btnNewButton.setBounds(299, 517, 251, 76);
		getContentPane().add(btnNewButton);
		
//Plano de fundo com a tela
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(endereco + "\\imagens\\Bomb Disarm.jpg"));
		lblNewLabel.setBounds(0, 0, 840, 620);
		getContentPane().add(lblNewLabel); 
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
