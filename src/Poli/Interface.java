package Poli;
import javax.swing.JFrame;
import javax.swing.JButton;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import java.awt.SystemColor;

import javax.swing.JLabel;


public class Interface {
	
	private JFrame frame;
	private JButton Add;
	private JButton Sub;
	private JButton Mul;
	private JLabel Rezultat;
	private JTextField Polinom1;
	private JTextField Polinom2;
	private JButton Div;
	private JButton IntegrareBtn;
	private JButton DerivareBtn;
	private JLabel Rest;
	private JLabel RezultatAfis;
	private JLabel RestAfis;
	
	
	
	private JLabel Mentiune1;
	private JLabel P1;
	private JLabel P2;
	private JLabel lblCoeficientgrad;
	private JLabel lblSiLaSfirsit;

	
	
	


			
			
			public Interface() {
				Creare();
			}
			
			public JFrame getFrame() {
				return frame;
			}


			public void setFrame(JFrame frame) {
				this.frame = frame;
			}
			
			private void Creare() {
				setFrame(new JFrame());
				getFrame().getContentPane().setBackground(SystemColor.controlShadow);
				getFrame().setBounds(100, 100, 800, 600);
				getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				getFrame().getContentPane().setLayout(null);
				
				RestAfis=new JLabel();
				Add = new JButton("+");
				Add.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Polinom m1=new Polinom();	
						m1.toPolinom(Polinom1.getText());
						Polinom m2=new Polinom();	
						m2.toPolinom(Polinom2.getText());
						OperatiiBi op=new Adunare(m1,m2);
						RezultatAfis.setText(op.Rezultat().toString());
						RestAfis.setVisible(false);
						
					}
				});
				Add.setFont(new Font("Tahoma", Font.BOLD, 20));
				Add.setForeground(Color.RED);
				Add.setBackground(new Color(240, 248, 255));
				Add.setBounds(644, 137, 59, 50);
				getFrame().getContentPane().add(Add);
				
				

				
				Sub = new JButton("-");
				Sub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Polinom m1=new Polinom();	
						m1.toPolinom(Polinom1.getText());
						Polinom m2=new Polinom();	
						m2.toPolinom(Polinom2.getText());
						OperatiiBi op=new Scadere(m1,m2);
						RezultatAfis.setText(op.Rezultat().toString());
						RestAfis.setVisible(false);
					}
				});
				Sub.setForeground(Color.RED);
				Sub.setFont(new Font("Tahoma", Font.BOLD, 19));
				Sub.setBackground(new Color(240, 248, 255));
				Sub.setBounds(720, 137, 54, 50);
				getFrame().getContentPane().add(Sub);
				
				Mul = new JButton("*\r\n");
				Mul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Polinom m1=new Polinom();	
						m1.toPolinom(Polinom1.getText());
						Polinom m2=new Polinom();	
						m2.toPolinom(Polinom2.getText());
						OperatiiBi op=new Inmultire(m1,m2);
						RezultatAfis.setText(op.Rezultat().toString());
						RestAfis.setVisible(false);
					}
				});
				
				Mul.setForeground(Color.RED);
				Mul.setFont(new Font("Tahoma", Font.BOLD, 20));
				Mul.setBackground(new Color(240, 248, 255));
				Mul.setBounds(644, 202, 59, 50);
				getFrame().getContentPane().add(Mul);
				
				Rezultat = new JLabel("Rezultat\r\n:");
				Rezultat.setFont(new Font("Times New Roman", Font.BOLD, 20));
				Rezultat.setBackground(new Color(255, 255, 255));
				Rezultat.setBounds(10, 150, 84, 32);
				getFrame().getContentPane().add(Rezultat);
				
				Polinom1 = new JTextField();
				Polinom1.setBounds(87, 11, 536, 32);
				getFrame().getContentPane().add(Polinom1);
				Polinom1.setColumns(10);
				
				Polinom2 = new JTextField();
				Polinom2.setBounds(87, 53, 536, 32);
				getFrame().getContentPane().add(Polinom2);
				Polinom2.setColumns(10);
				
				Div = new JButton("/\r\n");
				Div.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Polinom m1=new Polinom();	
						m1.toPolinom(Polinom1.getText());
						Polinom m2=new Polinom();	
						m2.toPolinom(Polinom2.getText());;
						Impartire op=new Impartire(m1,m2);
						RezultatAfis.setText(op.Rezultat().toString());
						RestAfis.setText(op.Restul().toString());
						RestAfis.setVisible(true);
						

					}
				});
				
				Div.setForeground(Color.RED);
				Div.setFont(new Font("Tahoma", Font.BOLD, 20));
				Div.setBackground(new Color(240, 248, 255));
				Div.setBounds(720, 202, 54, 50);
				getFrame().getContentPane().add(Div);
				
				IntegrareBtn = new JButton("Integrare");
				IntegrareBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Polinom m1=new Polinom();	
						m1.toPolinom(Polinom1.getText());
						OperatiiMono op=new Integrare(m1);
						RezultatAfis.setText(op.Result().toString());
						RestAfis.setVisible(false);
					}
				});
				IntegrareBtn.setForeground(Color.RED);
				IntegrareBtn.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
				IntegrareBtn.setBackground(Color.ORANGE);
				IntegrareBtn.setBounds(644, 11, 130, 50);
				getFrame().getContentPane().add(IntegrareBtn);
				
				DerivareBtn = new JButton("Derivare");
				DerivareBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Polinom m1=new Polinom();	
						m1.toPolinom(Polinom1.getText());
						
						OperatiiMono op=new Derivare(m1);
						RezultatAfis.setText(op.Result().toString());
						RestAfis.setVisible(false);
					}
				});
				DerivareBtn.setForeground(Color.RED);
				DerivareBtn.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
				DerivareBtn.setBackground(Color.ORANGE);
				DerivareBtn.setBounds(644, 74, 130, 50);
				getFrame().getContentPane().add(DerivareBtn);
				
				Rest = new JLabel("Rest: ");
				Rest.setFont(new Font("Times New Roman", Font.BOLD, 20));
				Rest.setBounds(18, 211, 59, 40);
				getFrame().getContentPane().add(Rest);
				
				RezultatAfis = new JLabel("");
				RezultatAfis.setBounds(97, 150, 536, 32);
				getFrame().getContentPane().add(RezultatAfis);
				
				RestAfis = new JLabel("");
				RestAfis.setBounds(87, 215, 556, 32);
				getFrame().getContentPane().add(RestAfis);
				
				;
				
				
				
			    Mentiune1 = new JLabel("** Construiti polinoamele p1 si p2 din monoame sub forma ");
			    Mentiune1.setToolTipText("** Construiti polinoamele p1 si p2 din monoame sub forma \r\n\t\t\t\t\tcoeficient X^ putere, \r\n\t si cu semnul la inceput si semnul plus \r\n\t\t\tla sfirsit de exemplu +2X^3+2X+1+");
				Mentiune1.setBounds(18, 393, 353, 29);
				frame.getContentPane().add(Mentiune1);
				
				P1 = new JLabel("P1");
				P1.setFont(new Font("Tahoma", Font.PLAIN, 30));
				P1.setBounds(31, 14, 33, 29);
				frame.getContentPane().add(P1);
				
				P2 = new JLabel("P2");
				P2.setFont(new Font("Tahoma", Font.PLAIN, 30));
				P2.setBounds(31, 56, 46, 29);
				frame.getContentPane().add(P2);
				
				lblCoeficientgrad = new JLabel("coeficient , X^,grad  si adaugati la inceput ,semnul primului monom,");
				lblCoeficientgrad.setBounds(28, 407, 337, 40);
				frame.getContentPane().add(lblCoeficientgrad);
				
				lblSiLaSfirsit = new JLabel("si la sfirsit semnul +, de exemplu +2X^3+4X^0+");
				lblSiLaSfirsit.setBounds(22, 433, 311, 29);
				frame.getContentPane().add(lblSiLaSfirsit);
				
				
			}
	}
