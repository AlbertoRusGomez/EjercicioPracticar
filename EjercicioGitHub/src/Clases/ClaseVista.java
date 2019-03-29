package Clases;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClaseVista extends JFrame{
	private static final long serialVersionUID = 1L;
	
	JTextField palabra = new JTextField(15);
	JTextField numero = new JTextField(5);
	
	JButton calcular = new JButton("Calcular");
	
	JPanel jpanel = new JPanel();
	
	public ClaseVista() {
		setTitle("Contar letras");
		setSize(320, 250);
		setLayout(new FlowLayout());
		
		jpanel.setPreferredSize(this.getSize());
		jpanel.setLayout(null);
		
		palabra.setBounds(60, 30, 200, 30);
		jpanel.add(palabra);
		
		numero.setBounds(60, 90, 50, 30);
		numero.setEditable(false);
		jpanel.add(numero);
		
		calcular.setBounds(170, 90, 90, 30);
		jpanel.add(calcular);
		
		add(jpanel);
		this.setVisible(true);
	}

}
