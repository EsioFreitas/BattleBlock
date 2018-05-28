
package Controller.Threads;

import View.BoardCanvas;

public class BoardThread  extends Thread{
    private BoardCanvas boardCanvas;
    private boolean running = true;
    
    public BoardThread(BoardCanvas boardCanvas){
        this.boardCanvas = boardCanvas;
    }
    
    @Override
    public void run(){
        while(running) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boardCanvas.paint(boardCanvas.getGraphics());
        }
    }
}
