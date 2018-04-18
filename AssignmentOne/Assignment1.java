import java.awt.Color;
import java.awt.Graphics;

//James Shively III
//ITC155 - Data Structures
//Stani Meredith
//Assignment1.java

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create DrawingPanel
		DrawingPanel dp = new DrawingPanel(220,150);
		
		//set graphics for DrawingPanel
		Graphics g = dp.getGraphics();
		
		//set background
		dp.setBackground(Color.YELLOW);
		
		//draw ovals
		g.drawOval(50, 25, 40, 40);
		g.drawOval(130, 25, 40, 40);
		//fill ovals
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(130, 25, 40, 40);
		
		
		
		//draw rectangle
		g.drawRect(70, 45, 80, 80);
		//fill rectangle
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		
		//draw lines
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);
		g.drawLine(70, 86, 150, 86);
		
	}

}
