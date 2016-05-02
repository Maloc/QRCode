package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Display extends JPanel {
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){
		try {
		      Image img = ImageIO.read(new File("./src/main/resources/images/myQRCode.png"));
		      g.drawImage(img, 75, 0, this);
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		
		Font font = new Font("TimesRoman", Font.PLAIN, 20);
	    g.setFont(font);
	    g.setColor(Color.black);
	    g.drawString("Subject: "+Main.theSubject, 10, 220); 
	    g.drawString("Room: "+Main.theRoom, 10, 250);
	    g.drawString("Time/Date: "+Main.theDateTime, 10, 280);
	}
}
