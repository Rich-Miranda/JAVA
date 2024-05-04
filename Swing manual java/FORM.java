
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class prj extends JFrame implements ActionListener
{
	JLabel label1,label2, label3,label4,label5,label6,label7;
	JButton b1,b2;
	JTextField t1,t2,t3,t4;
	JMenuBar menuBar1;
	JMenu menuCadastro, menuFormulario, menuQuestionario,menuSair;
	JMenuItem miCliente, mirlForms, mirQuest, mirQuit;

	public static void main (String args[])
	{
	 	JFrame janela= new prj();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	prj()
	{
		setTitle("Dados cadastrais");
		setBounds(500,300,350,200); //x, y, largura, altura
		getContentPane().setBackground(new Color (30,30,30));
		getContentPane().setLayout(new GridLayout(5,3));
		
		
		
		menuBar1= new JMenuBar();
		
		menuCadastro = new JMenu("Cadastro");
		
		menuFormulario = new JMenu("Formulario");
		
		menuQuestionario = new JMenu("Questionario");
		
		menuSair = new JMenu("Sair");
		
		miCliente = new JMenuItem("Cliente");
		miCliente.addActionListener(this);
		
		
		
		
		
		mirlForms = new JMenuItem("Forms");
		mirlForms.addActionListener(this);
		
		mirQuest = new JMenuItem("Questio");
		mirQuest.addActionListener(this);
		
		
		mirQuit = new JMenuItem("Quit");
		mirQuit.addActionListener(this);
		
		
		menuCadastro.add(miCliente);
		
		menuFormulario.add(mirlForms);
		
		
		menuQuestionario.add(mirQuest);
		
		menuSair.add(mirQuit);
		
		
		
		
		
		
		
		label1 = new JLabel ("NOME");
		label1.setForeground(Color.white);
		label1.setFont(new Font("",Font.BOLD,14));
		
		label2 = new JLabel ("E-MAIL");
		label2.setForeground(Color.white);
		label2.setFont(new Font("",Font.BOLD,14));
		
		
		label3 = new JLabel ("CPF");
		label3.setForeground(Color.white);
		label3.setFont(new Font("",Font.BOLD,14));
		
		label4 = new JLabel ("Telefone");
		label4.setForeground(Color.white);
		label4.setFont(new Font("",Font.BOLD,14));
		
		label5 = new JLabel ("");
		label6 = new JLabel ("");
		
		
		b1 = new JButton ("LOGIN");
		b1.addActionListener(this);
		
		b2 = new JButton ("LIMPAR");
		b2.addActionListener(this);
		
		
		t1 = new JTextField();          
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		
		//getContentPane().add(label1);
	
		
		
		
		menuBar1.add(menuCadastro);
		menuBar1.add(menuFormulario);
		menuBar1.add(menuQuestionario);
		menuBar1.add(menuSair);
		setJMenuBar(menuBar1);
		//getContentPane().add(t1);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==miCliente)
		{
			getContentPane().add(label1);
			getContentPane().add(t1);
			getContentPane().add(label2);
			getContentPane().add(t2);
			getContentPane().add(label3);
			getContentPane().add(t3);
			getContentPane().add(label4);
			getContentPane().add(t4);
			
			getContentPane().add(b1);
			getContentPane().add(b2);
			
			
			if(e.getSource()==b2) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
			
			
			if(e.getSource()==b1) {
				JOptionPane.showMessageDialog(b1,"Cadastrado");
				
			}
			return;	
		}
		
			
		if (e.getSource()==mirlForms)
		{
			JFrame janela = new forms();
			janela.setUndecorated(true);
			janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setVisible(true);
		}
		
		if(e.getSource()==mirQuest)
		{
			JFrame janela = new quest();
			janela.setUndecorated(true);
			janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setVisible(true);
		}
		
		if(e.getSource()==b1) {
			JOptionPane.showMessageDialog(b1,"Sucesso");
		}
		
		if(e.getSource()== b1) {
			JFrame janela = new forms();
			janela.setUndecorated(true);
			janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setVisible(true);
		}
		if(e.getSource()== mirQuit)
			System.exit(0);
		
	}	
	
}
