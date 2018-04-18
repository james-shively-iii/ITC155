import java.awt.Color;
import java.awt.Graphics;

public class DrawShapes {

	public static final int RECTS = 32;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initiate DrawingPanel()
		DrawingPanel p = new DrawingPanel(200,200);
		Graphics g = p.getGraphics();
		/*Graphics g1 = p.getGraphics();
		
		for(int i = 0; i < 10; i++) {
			g.drawRect(0, 0, 50, 50);
			g1.fillRect(0, 0, 25, 25);
			g1.setColor(Color.RED);*/
		
		// from black to white, top/left to bottom/right
        for (int i = 0; i < RECTS; i++) {
            int shift = i * 256 / RECTS;
            g.setColor(new Color(shift, shift, shift));
            g.fillRect(shift, shift, 20, 20);
		}
	}

}
