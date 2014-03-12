import java.awt.Graphics;


public class wuerfel {
	linie p1p2;
	linie p2p3;
	linie p3p4;
	linie p4p1;
	
	linie p5p6;
	linie p6p7;
	linie p7p8;
	linie p8p5;
	
	linie p1p5;
	linie p2p6;
	linie p3p7;
	linie p4p8;
	
	public wuerfel(){
		this(new punkt(-100,100,100), 
			 new punkt(100,100,100),
			 new punkt(100,-100,100), 
			 new punkt(-100,-100,100), 
			 new punkt(-100,100,-100), 
			 new punkt(100,100,-100), 
			 new punkt(100,-100,-100), 
			 new punkt(-100,-100,-100));
	}
	
	public wuerfel(punkt p1,punkt p2,punkt p3,punkt p4,punkt p5,punkt p6,punkt p7,punkt p8){
		p1p2 = new linie(p1,p2);
		p2p3 = new linie(p2,p3);
		p3p4 = new linie(p3,p4);
		p4p1 = new linie(p4,p1);
		
		p5p6 = new linie(p5,p6);
		p6p7 = new linie(p6,p7);
		p7p8 = new linie(p7,p8);
		p8p5 = new linie(p8,p5);
		
		p1p5 = new linie(p1,p5);
		p2p6 = new linie(p2,p6);
		p3p7 = new linie(p3,p7);
		p4p8 = new linie(p4,p8);
	}
	public void drawCube(Graphics g){
		p1p2.drawLine(g);
		p2p3.drawLine(g);
		p3p4.drawLine(g);
		p4p1.drawLine(g);
		
		p5p6.drawLine(g);
		p6p7.drawLine(g);
		p7p8.drawLine(g);
		p8p5.drawLine(g);
		
		p1p5.drawLine(g);
		p2p6.drawLine(g);
		p3p7.drawLine(g);
		p4p8.drawLine(g);
	}
	public void drehen(int winkelX, int winkelY, int winkelZ){
		p1p5.p1.drehen(winkelX, winkelY, winkelZ);
		p1p5.p2.drehen(winkelX, winkelY, winkelZ);
		p2p6.p1.drehen(winkelX, winkelY, winkelZ);
		p2p6.p2.drehen(winkelX, winkelY, winkelZ);
		p3p7.p1.drehen(winkelX, winkelY, winkelZ);
		p3p7.p2.drehen(winkelX, winkelY, winkelZ);
		p4p8.p1.drehen(winkelX, winkelY, winkelZ);
		p4p8.p2.drehen(winkelX, winkelY, winkelZ);
	}
}
