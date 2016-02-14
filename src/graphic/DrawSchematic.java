package graphic;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import java.awt.BasicStroke;
import java.awt.RenderingHints;
import java.awt.Point;





class Surface extends JPanel {
	public int zID=0;
	public int rID=0;
	public int pID=0;
	
	//ZAŠTITA
	class zListener implements ActionListener
	  {
		private int id;
		
	    public zListener(int id) {
	        this.id = id;
	    }
	    public void actionPerformed(ActionEvent event)
	    {   
	    	System.out.println("Done_______________________________________z"+id);
	     }    
	   }
	public void drawZastita(Graphics g, int x, int y){
		int id= zID++;
		g.setColor(new Color(0, 0, 0));
		g.drawOval(x, y, 30, 30);
		g.drawLine(x+30, y+15, x+50, y+15);
		g.drawLine(x+40, y+10, x+40, y+20);
		JButton zButton = new JButton();
        zButton.setBounds(x , y ,50, 30);
        zButton.setBorder(BorderFactory.createEmptyBorder());
        zButton.setContentAreaFilled(false);
        ActionListener zListener = new zListener(id);
        zButton.addActionListener(zListener);
        add(zButton);
	}
	
	//RASTAVLJAÈ
	class rListener implements ActionListener
	  {
		private int id;
		
	    public rListener(int id) {
	        this.id = id;
	    }
	    public void actionPerformed(ActionEvent event)
	    {   
	    	System.out.println("Done_______________________________________r"+id);
	     }    
	   }
	public void drawRastavljac(Graphics g, int x, int y){
		g.setColor(new Color(0, 0, 0));
		int id= rID++;
		g.drawRect(x, y, 30, 30);
		g.drawLine(x, y+30, x+30, y);
		
		JButton rButton = new JButton();
      rButton.setBounds(x , y ,30, 30);
      rButton.setBorder(BorderFactory.createEmptyBorder());
      rButton.setContentAreaFilled(false);
      ActionListener rListener = new rListener(id);
      rButton.addActionListener(rListener);
      add(rButton);
	}
	
	
	
	//PREKIDAÈ
	class pListener implements ActionListener
	  {
		private int id;
		
	    public pListener(int id) {
	        this.id = id;
	    }
	    public void actionPerformed(ActionEvent event)
	    {   
	    	System.out.println("Done_______________________________________p"+id);
	     }    
	   }
	public void drawPrekidac(Graphics g, int x, int y){
		int id= pID++;
		g.setColor(new Color(0, 0, 0));
		g.drawLine(x, y+30, x+20, y);
		g.drawLine(x+10, y+15, x+30, y+15);
		g.drawOval(x+30, y+10, 10, 10);
		JButton pButton = new JButton();
		pButton.setBounds(x , y ,40, 30);
		pButton.setBorder(BorderFactory.createEmptyBorder());
		pButton.setContentAreaFilled(false);
		ActionListener pListener = new pListener(id);
		pButton.addActionListener(pListener);
		add(pButton);
	}
	
	//MISC SYMBOLS
	
	public void drawGround(Graphics g, int x, int y){
		g.drawLine(x, y, x+20, y);
		g.drawLine(x+5, y+5, x+15, y+5);
		g.drawLine(x+10, y+10, x+11, y+10);
	}
	
    public void doDrawing(Graphics g) {
    	
    	setLayout(null);
    	RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        
        Graphics2D g2d = (Graphics2D) g;
        //Crtanje sheme
        
        BasicStroke bs3 = new BasicStroke(2, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs3);
        
        drawZastita(g2d, 140, 70);
        drawRastavljac(g2d, 50, 70);
        drawPrekidac(g2d, 155, 120);
        drawGround(g2d, 55, 120);
        drawZastita(g2d, 140, 170);
        drawZastita(g2d, 140, 220);
        drawRastavljac(g2d, 140, 300);
        drawRastavljac(g2d, 50, 300);
        drawGround(g2d, 55, 360);
        
        g2d.drawLine(80,85,140,85);
        g2d.drawLine(65,100,65,120);
        g2d.drawLine(155,100,155,120);
        g2d.drawLine(155,150,155,170);
        g2d.drawLine(155,200,155,220);
        g2d.drawLine(155,250,155,300);
        g2d.drawLine(65,330,65,360);
        g2d.drawLine(80,315,140,315);
        
        g2d.drawLine(170,315,850,315);
        g2d.drawLine(955,330,955,360);
        g2d.drawLine(880,315,940,315);
        
        g2d.drawLine(865,330,865,700);
        
        drawRastavljac(g2d, 940, 300);
        drawRastavljac(g2d, 850, 300);
        drawGround(g2d, 945, 360);
    
        drawRastavljac(g2d, 940, 700);
        drawRastavljac(g2d, 850, 700);
        drawGround(g2d, 945, 760);
        
        drawZastita(g2d, 140, 470);
        drawRastavljac(g2d, 50, 470);
        drawPrekidac(g2d, 155, 520);
        drawGround(g2d, 55, 520);
        drawZastita(g2d, 140, 570);
        drawZastita(g2d, 140, 620);
        drawRastavljac(g2d, 140, 700);
        drawRastavljac(g2d, 50, 700);
        drawGround(g2d, 55, 760);
    
        g2d.drawLine(80,485,140,485);
        g2d.drawLine(65,500,65,520);
        g2d.drawLine(155,500,155,520);
        g2d.drawLine(155,550,155,570);
        g2d.drawLine(155,600,155,620);
        g2d.drawLine(155,650,155,700);
        g2d.drawLine(65,730,65,760);
        g2d.drawLine(80,715,140,715);
        
        g2d.drawLine(170,715,850,715);
        g2d.drawLine(955,730,955,760);
        g2d.drawLine(880,715,940,715);
    }

    @Override
    public void paintComponent(Graphics g) {
                
        super.paintComponent(g);
        doDrawing(g);
    }           
}

public class DrawSchematic extends JFrame {

    public DrawSchematic() {
    	
        initUI();
        
    }

    private void initUI() {
        
        add(new Surface());
        
        setTitle("Colours");
        setSize(1024, 1000);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void run() {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
            	DrawSchematic ex = new DrawSchematic();
                ex.setVisible(true);
            }
        });
    }
}
