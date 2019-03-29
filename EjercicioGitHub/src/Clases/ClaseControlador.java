package Clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ClaseControlador implements ActionListener, WindowListener {
	/* Declaramos dos objetos que vamos a controlar */
	ClaseVista objVista = null; 
	ClaseModelo objModelo = null;
	
	/* Constructor */
	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 

		/* Añadimos los escuchadores */
		objVista.calcular.addActionListener(this);
	}

	public void windowActivated(WindowEvent arg0) {

	}

	public void windowClosed(WindowEvent e) {

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent e) {

	}

	public void windowDeiconified(WindowEvent e) {

	}

	public void windowIconified(WindowEvent e) {

	}

	public void windowOpened(WindowEvent e) {

	}

	public void actionPerformed(ActionEvent e) {
		//Primero averiguar qué botón generó este evento
		Object boton = e.getSource();
		int resultado;
		if(boton.equals(objVista.calcular)) {
			resultado = objModelo.CalcularLetras(objVista.palabra.getText());
			objVista.palabra.setText(Integer.toString(resultado));
		}
	}

}
