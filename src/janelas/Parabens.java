// tela dos parabens
package janelas;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Parabens extends JFrame{
	
	 String endereco = System.getProperty("user.dir");
	 
	public Parabens() {
		setSize(500,500);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setBackground(new Color(200,0,0,0));
		setVisible(true);
		
		JLabel parabens = new JLabel("");
		//explodiu.setHorizontalAlignment(SwingConstants.CENTER);
		parabens.setBounds(0, 0, 796, 562);
		getContentPane().add(parabens, BorderLayout.CENTER);
		parabens.setOpaque(false);
		parabens.setIcon(new ImageIcon(endereco +"\\imagens\\parabens.png"));
		getContentPane().add(parabens);	
		
		
		JButton btnSair = new JButton("");
		btnSair.setBounds(0, 0, 806, 573);
		getContentPane().add(btnSair);
		btnSair.setBackground(new Color(0,0,0,0));
		btnSair.setBorderPainted(false);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				dispose();
			}
		});	
		
		
		
	}
	
}
