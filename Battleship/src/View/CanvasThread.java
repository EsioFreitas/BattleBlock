/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;



import java.awt.Graphics;

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
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			canvas.paint(canvas.getGraphics());
		}
	}
}
