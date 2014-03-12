import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;


public class frame extends Canvas {
	
	private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private static final int cube_size = 200;
    private static final Random random = new Random();
    //private static private linie[] = new linie[9];

    @Override
    public void paint(Graphics g) {
        		super.paint(g);
        		long t0,t1;
        		int i = 1;
        		g.setColor(new Color(0,0,0));
                g.drawLine(0, 0, 50, 200);
                g.clearRect(0, 0, WIDTH, HEIGHT); 
                //punkt p1 = new punkt(200,200,200);
                //punkt p2 = new punkt(20,20,20);
                //punkt p3 = new punkt(200,-200,200);
                //linie p1p2 = new linie(p1,p2);
                //linie p2p3 = new linie(p2,p3);
                wuerfel cube = new wuerfel();
                //wuerfel cube_temp = new wuerfel();;
                while(true){
                	
                	t0=System.currentTimeMillis();
                    do{
                        t1=System.currentTimeMillis();
                    }
                    while (t1-t0<20);
                    
                    cube.drehen(3, 0, 3);
                    //p1.drehen(0,0,1);
                    //p2.drehen(0,0,1);  
                    g.setColor(new Color(0,0,0));
                    //g.clearRect(0, 0, WIDTH, HEIGHT);
                    //p1p2.drawLine(g);
                    //p2p3.drawLine(g);
                    g.clearRect(0, 0, WIDTH, HEIGHT);
                    cube.drawCube(g);
                    i++;
                }
                
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(WIDTH, HEIGHT);
        frame.add(new frame());
        frame.setVisible(true);
    }
}


