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
//primeira janela de explicação
public class Explicacao extends JFrame {
	private JTextArea falaPolicial;
	String endereco = System.getProperty("user.dir");
	public Explicacao() {
		
		setSize(771,500);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		JLabel policial = new JLabel("");
		policial.setBounds(-15, 42, 371, 419);
		policial.setOpaque(false);
		policial.setIcon(new ImageIcon(endereco + "\\imagens\\policial.png"));
		getContentPane().add(policial);
		
		JButton btnDesarmar = new JButton("Pr\u00F3ximo");
		btnDesarmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Explicacao2().setVisible(true);
			}
		});
btnDesarmar.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDesarmar.setBounds(604, 409, 141, 41);
		getContentPane().add(btnDesarmar);
		
		falaPolicial = new JTextArea();
		falaPolicial.setFont(new Font("Monospaced", Font.PLAIN, 16));
		falaPolicial.setWrapStyleWord(true);
		falaPolicial.setText("Ol\u00E1 Policial ,\n eu sou o Tenente Cabral, \n e voc\u00EA  \u00E9 \no nosso melhor policial "
									+ "\r\n em desarmamento de bombas! "
									+ "\n\n\n Não me Decepcione, \n e vamos Salvar Todos ! ");
		falaPolicial.setBounds(410, 125, 251, 243);
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
