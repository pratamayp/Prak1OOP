package id.ac.uns.vokasi.d3ti.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MateriPertama extends Applet implements KeyListener{
	Image img;
	Image img2;
	int x,y;
	int a=300,b;
	public void init() {
		x=0;
		y=0;
		img=getImage(getDocumentBase(),"dante.png");
		img2=getImage(getDocumentBase(),"vergil2.png");
		addKeyListener(this);
	}
	
	public void paint(Graphics g) {
		setBackground(Color.RED);
		g.setColor(Color.CYAN);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawRect(100, 100, 300, 300);
		
		
		g.setColor(Color.WHITE);
		g.drawLine(10, 40, 100, 40);
		g.drawArc(30, 30, 50, 50, 0, 360);
		/*for(int i=250; i<=700; i+=100) {
		g.drawImage(img2, i, 70, 100, 100, this);
		}*/
		g.drawImage(img2, a, b, 300, 300, this);
		g.drawImage(img, x, y, 300, 300, this);
		//kotaJalan(g);
	}
	
	public void kotaJalan(Graphics g) {
		for(int i=0;i<50;i+=10) {
			g.setColor(Color.DARK_GRAY);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.fillRect(i,30,20,20);
			}
			repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getKeyCode()) {
		case KeyEvent.VK_RIGHT:x=x+50; 
			System.out.println("Dante bergerak ke Kanan");
			break;
		case KeyEvent.VK_LEFT:x=x-50;
			System.out.println("Dante bergerak ke Kiri");
			break;
		case KeyEvent.VK_UP:y=y-50;
			System.out.println("Dante bergerak ke Atas");
			break;
		case KeyEvent.VK_DOWN:y=y+50;
			System.out.println("Dante bergerak ke Bawah");
			break;
		case KeyEvent.VK_D:a=a+50; 
			System.out.println("Vergil bergerak ke Kanan");
			break;
		case KeyEvent.VK_A:a=a-50; 
			System.out.println("Vergil bergerak ke Kiri");
			break;
		case KeyEvent.VK_W:b=b-50; 
			System.out.println("Vergil bergerak ke Atas");
			break;
		case KeyEvent.VK_S:b=b+50; 
			System.out.println("Vergil bergerak ke Bawah");
			break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
