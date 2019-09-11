//Primeira tela do Jogo com enigmas
package janelas;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class telaDoJogo extends JFrame {
	
	private int numPergunta = 0;
	private int tamanho = 5;
	private JLabel[] labelEnigma = new JLabel[tamanho];
	private JLabel labelFaixaDeFundo = new JLabel();
	private JTextField textoDigitado;
	private JLabel lblDinamite;
	private JLabel[] fio = new JLabel[5];
	private JLabel[] fioCortado = new JLabel[5];
	private JButton btnProximo = new JButton("PRÓXIMO");
	String endereco = System.getProperty("user.dir");
	
	
//################### construtor ######################
		public telaDoJogo() {
			setSize(840,620);
			setTitle("Comece o Desarme");
			getContentPane().setLayout(null);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			for(int i=0; i<tamanho; i++) {
				labelEnigma[i] = new JLabel();
				labelEnigma[i].setVisible(false);
				labelEnigma[i].setBounds(48, 38, 748, 100);
				labelEnigma[i].setOpaque(false);
				labelEnigma[i].setFont(new Font("Dialog", Font.BOLD, 24));
				labelEnigma[i].setForeground(Color.BLACK);
				getContentPane().add(labelEnigma[i]);
			}
			
			labelEnigma[0].setVisible(true);
			labelEnigma[0].setText("1) 29 D_ _ _  t_ _  F_ _ _ _ _ _ _ _  em um A_ _ _ B_ _ _ _ _ _ _");
			labelEnigma[1].setText("2) 26 L_ _ _ _ _  t_ _  o A_ _ _ _ _ _ _");
			labelEnigma[2].setText("3) A B_ _ _ _ _ t_ _  66 L_ _ _ _ _");
			labelEnigma[3].setText("4) 3 R_ _ _ _  n_ _  T_ _ _ _ _ _ _");
			labelEnigma[4].setText("5) O C_ _ _ _  H_ _ _ _ _  t_ _  d_  4  a  6  l_ _ _ _ _  d_ S_ _ _ _ _ _");
			
			labelFaixaDeFundo.setIcon(new ImageIcon(endereco + "\\imagens\\faixa_amarela.png"));
			labelFaixaDeFundo.setBounds(40, 63, 748, 100);
			getContentPane().add(labelFaixaDeFundo);
		
									
//Botão INÍCIO			
			JButton btnInicio = new JButton("INÍCIO");
			btnInicio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
					new telaInicial().setVisible(true);
				}
			});		
			btnInicio.setFont(new Font("Dialog", Font.BOLD, 24));
			btnInicio.setToolTipText("");
			btnInicio.setBounds(450, 506, 175, 53);
			getContentPane().add(btnInicio);	
			
			
//Botão CORTAR			
			JButton btnCortar = new JButton("CORTAR ");
			btnCortar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {;
					verificarTextoDigitado(numPergunta);
				}
			});
			btnCortar.setToolTipText("");
			btnCortar.setFont(new Font("Dialog", Font.BOLD, 24));
			btnCortar.setBounds(522, 270, 251, 76);
			getContentPane().add(btnCortar);
			
			
//Botão PRÓXIMO			
			
			btnProximo.setToolTipText("");
			btnProximo.setFont(new Font("Dialog", Font.BOLD, 24));
			btnProximo.setBounds(637, 506, 175, 53);
			btnProximo.setEnabled(false);
			btnProximo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {;
					btnProximo.setEnabled(false);
					textoDigitado.setText("");
					if(numPergunta==4) {
						dispose();
						new Parabens().setVisible(true);
					}else {
						proximaPergunta(numPergunta+1);
					}
				}
			});
			getContentPane().add(btnProximo);
			
//Caixa de Texto pra Verificação 
			
			textoDigitado = new JTextField();
			textoDigitado.setHorizontalAlignment(SwingConstants.CENTER);
			textoDigitado.setBounds(40, 175, 748, 59);
			getContentPane().add(textoDigitado);
			textoDigitado.setColumns(10);
			textoDigitado.setFont(new Font("Dialog", Font.BOLD, 24));			
			
//imagem da dinamite			
			lblDinamite = new JLabel("Dinamite");
			lblDinamite.setHorizontalAlignment(SwingConstants.CENTER);
			lblDinamite.setIcon(new ImageIcon(endereco + "\\imagens\\editorDaDinamite.png"));
			lblDinamite.setBounds(50, 246, 372, 133);
			getContentPane().add(lblDinamite);		
	
			
			
//Criação de tomada e fios
			JPanel panel = new JPanel();
			panel.setBackground(Color.DARK_GRAY);
			panel.setBounds(97, 475, 268, 39);
			getContentPane().add(panel);
			
			JLabel tomada = new JLabel();
			tomada.setBackground(new Color(Color.TRANSLUCENT));
			tomada.setIcon(new ImageIcon(endereco + "\\imagens\\tomada.png"));
			tomada.setBounds(0, 475, 268, 39);
			getContentPane().add(tomada);
				
			int FioPosicao=100;
			for(int i=0;i<5;i++) {
				fio[i] = new JLabel();
				fio[i].setIcon(new ImageIcon(endereco + "\\imagens\\fio_"+(i+1)+".png"));
				fio[i].setBounds(FioPosicao, 346, 372, 133);
				fio[i].setVisible(true);
				getContentPane().add(fio[i]);
				FioPosicao+=50;
			}
			
			FioPosicao=100;
			for(int i=0; i<5; i++) {
				fioCortado[i] = new JLabel();
				fioCortado[i].setIcon(new ImageIcon(endereco + "\\imagens\\Fio_Cortado_"+(i+1)+".png"));
				fioCortado[i].setBounds(FioPosicao, 346, 372, 133);
				fioCortado[i].setVisible(false);
				getContentPane().add(fioCortado[i]);
				FioPosicao+=50;
			}
								
			
//TELA plano de fundo
			JLabel lblPlanoDeFundo = new JLabel("");
			lblPlanoDeFundo.setIcon(new ImageIcon(endereco + "\\imagens\\bd_background.jpg"));
			lblPlanoDeFundo.setBounds(0, 0, 824, 581);
			getContentPane().add(lblPlanoDeFundo);
			setVisible(true);
			setLocationRelativeTo(null);
				
}
		
		//=================================== criação de métodos =================================
		//próxima PERGUNTA
				public void proximaPergunta(int numPergunta) {
					if(numPergunta>tamanho) {
						JOptionPane.showMessageDialog(null, "Bomba Desarmada com Sucesso");
						new Parabens().setVisible(true);
						dispose();
						System.exit(0);
					} else {
						if(numPergunta>0) {
							labelEnigma[numPergunta-1].setVisible(false);
							labelEnigma[numPergunta].setVisible(true);
							this.numPergunta++;
						}
					}
				
				}
				
		//verificar o Texto que foi digitado		
				public void verificarTextoDigitado(int numPergunta) {
					String[] variosTextos = new String[tamanho];
					
					variosTextos[0] = "29 Dias tem Fevereiro em um Ano Bissexto";
					variosTextos[1] = "26 Letras tem o Alfabeto";
					variosTextos[2] = "A Bíblia tem 66 Livros";
					variosTextos[3] = "3 Rodas num Triciclo";
					variosTextos[4] = "O Corpo Humano tem de 4 a 6 litros de Sangue";			
					
								
					if(textoDigitado.getText().equals(variosTextos[numPergunta])) {
						JOptionPane.showMessageDialog(null, "Correto!!  Vamos Cortar o Fio " + (numPergunta+1) + "! " );
						fio[numPergunta].setVisible(false);
						fioCortado[numPergunta].setVisible(true);
						btnProximo.setEnabled(true);
					}else {
						dispose();
						new explodirBomba().setVisible(true);
					}
				}
}
