package com.yzu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Star extends Frame{
	//define width and height
	//像素为单位
	public static final int FRAME_WIDTH =800;
	public static final int FRAME_LENGTH = 600;
	// get your computer screenSize
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	int screenWidth = screenSize.width;
	int screenLength = screenSize.height;
	
	int [] x = new int[60];
	int [] y = new int[60];
	
	public static void main(String[] args) {
		new Star();
	}
	
	public void update(Graphics g) {
		//System.out.println("调用了update方法");
		//x,y以画板为坐标轴
		g.setFont(new Font("TimesRoman",Font.BOLD,20));
		for(int i=0;i<60;i++) {
			int R = (int)(Math.random()*255);
			int G = (int)(Math.random()*255);
			int B = (int)(Math.random()*255);
			g.setColor(new Color(R,G,B));
			g.drawString("★", x[i], y[i]);
		}
		
	}
	
	public Star() {
		for(int i=0;i<x.length;i++) {
			x[i] = (int)(Math.random()*800);
			y[i] = (int)(Math.random()*600);
		}
		this.setVisible(true);
		this.setSize(FRAME_WIDTH, FRAME_LENGTH);
		this.setResizable(false);
		//设置窗口关闭模式
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//set window location  居中显示
		this.setLocation(screenWidth/2-400, screenLength/2-300);
		this.setBackground(Color.black);
		//这个方法会默认调用update方法
		new Thread(new PaintThread()).start();;
	}
	
	private class PaintThread implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				repaint();
				for (int i=0;i<x.length;i++) {
					x[i]+=20;
					y[i]+=20;
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
			
		}
		
	}
}
