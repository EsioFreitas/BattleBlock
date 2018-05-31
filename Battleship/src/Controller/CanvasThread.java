package Controller;

import java.awt.Graphics;

import View.GameCanvas;

public class CanvasThread extends Thread {
	private GameCanvas canvas;
	private boolean running = true; 
	
	public CanvasThread(GameCanvas canvas) {
		this.canvas = canvas;
	}
	
	@Override
	public void run() {
		while(running) {
			try {
				Thread.sleep(100);
				canvas.paint(canvas.getGraphics());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
