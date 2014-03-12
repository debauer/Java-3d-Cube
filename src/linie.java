import java.awt.*;


public class linie{
		punkt p1;
		punkt p2;
		private static final int WIDTH = 600;
	    private static final int HEIGHT = 600;
		public linie(punkt p1,punkt p2){
			this.p1 = p1;
			this.p2 = p2;
		}
		public void drawLine(Graphics g){
			g.drawLine((int) (p1.x+(WIDTH/2)), (int) (p1.y+(HEIGHT/2)), (int) (p2.x+(WIDTH/2)), (int) (p2.y+(HEIGHT/2)));
		}
		public void drehen(int winkelX, int winkelY, int winkelZ){
		}
}
