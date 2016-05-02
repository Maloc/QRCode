package main;

import java.awt.Color;
import javax.swing.*;

public class WindowGUI extends JFrame{
	private static final long serialVersionUID = 1L;

	public void buildGUI(){ 
		this.setTitle("QRCode");
	    this.setSize(600, 600);
	    this.setBackground(Color.white);
	    this.setResizable(false);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setContentPane(new Component());
	    this.setVisible(true);
	}
}
