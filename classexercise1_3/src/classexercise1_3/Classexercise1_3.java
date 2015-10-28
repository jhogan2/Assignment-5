package classexercise1_3;

import java.awt.Graphics;
import javax.swing.JApplet;

public class Classexercise1_3 extends JApplet {
	public void paint(Graphics canvas) {
		// Coordinates of the boundaries of the tic tac toe board
		canvas.drawLine(0, 150, 200, 150); //bottom horizontal line
		canvas.drawLine(0, 80, 200, 80);//top horizontal line
		canvas.drawLine(50, 0, 50, 200);//left vertical line
		canvas.drawLine(120,0,120,200);//right vertical line
		
		//for the shape of the X's
		canvas.drawLine(0, 0, 50, 50);//left to right.first x
		canvas.drawLine(0, 50, 50, 0);//right to left.first x
		canvas.drawLine(52, 0, 120, 50);//second x going from left to right
		canvas.drawLine(52, 52, 120, 0);//second x going from r to l
		canvas.drawLine(122, 0, 180, 50);//third x, l to r
		canvas.drawLine(122, 52, 182, 0);//third x, r to l
		
		//line through the xxx
		canvas.drawLine(0, 20, 200, 20);
		
		//for the shape of the O's
		canvas.drawOval(55, 85, 52, 52);//middle O
		canvas.drawOval(135, 150, 52, 52);
	}

}
