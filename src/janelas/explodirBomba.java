//Explodir bomba
package janelas;
import javax.sound.sampled.DataLine;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.applet.*;

public class explodirBomba extends JFrame {
	String endereco = System.getProperty("user.dir");
	
	public explodirBomba() {
			setSize(822,612);
			setLocationRelativeTo(null);
			getContentPane().setLayout(null);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setUndecorated(true);
			setBackground(new Color(200,0,0,0));
			
		
			JLabel explodiu = new JLabel("");
			explodiu.setBounds(0, 0, 796, 562);
			getContentPane().add(explodiu, BorderLayout.CENTER);
			explodiu.setOpaque(false);
			explodiu.setIcon(new ImageIcon(endereco + "\\imagens\\boom-copy.png"));
			getContentPane().add(explodiu);	
			
			
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
