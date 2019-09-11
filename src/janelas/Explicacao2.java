package janelas;


import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//Segunda tela de explicação
public class Explicacao2 extends JFrame {
	private JTextArea falaPolicial;
	String endereco = System.getProperty("user.dir");
	
	public Explicacao2() {
		
		setSize(771,500);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		//setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		JLabel policial = new JLabel("");
		policial.setBounds(-15, 42, 371, 419);
		policial.setOpaque(false);
		policial.setIcon(new ImageIcon(endereco + "\\imagens\\policial.png"));
		getContentPane().add(policial);
		
		JButton btnDesarmar = new JButton("Desarmar");
		btnDesarmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new telaDoJogo().setVisible(true);
			}
		});
		btnDesarmar.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDesarmar.setBounds(604, 409, 141, 41);
		getContentPane().add(btnDesarmar);
		
		falaPolicial = new JTextArea();
		falaPolicial.setFont(new Font("Monospaced", Font.PLAIN, 14));
		falaPolicial.setWrapStyleWord(true);
		falaPolicial.setText("Para Desarmar a bomba, você "
								+ "\nprecisa seguir o exemplo \ndo enigma abaixo: "
								+ "\n\n7 D_ _ _ n_ S_ _ _ _ _"
								+ "\n7 Dias na Semana"
								+ "\n       Você Consegue!"
								+ "\n\n"
								+ "\n-> Não Esqueça: "
								+ "\n*Letras Maiusculas "
								+ "\n*Letras Minúsculas e Acentos");
		falaPolicial.setBounds(408, 114, 250, 244);
		falaPolicial.setForeground(Color.BLACK);
		getContentPane().add(falaPolicial);
		falaPolicial.setColumns(10);
		
		
		JLabel balao = new JLabel("");
		balao.setBounds(289, -12, 549, 527);
		balao.setOpaque(false);
		balao.setIcon(new ImageIcon(endereco + "\\imagens\\balao.png"));
		getContentPane().add(balao);
		
		
		
	}
}

