
package View;

import Controller.Board;
import Controller.Threads.BoardThread;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;


public class PlayFrame extends JFrame {
    
    private BoardCanvas boardCanvas = new BoardCanvas();
    BoardThread boardThread = new BoardThread(boardCanvas);
    
    //thred
    
    public PlayFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());
        setTitle("Stellar Balle");
        getContentPane().add("Center", boardCanvas);
        
        setSize(boardCanvas.WIDTH * boardCanvas.getRows(), boardCanvas.HEIGHT * boardCanvas.getCols());
        
        setVisible(true);
        
        boardThread.start();
        
        boardCanvas.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int x=e.getX();
                int y = e.getY();
                
                int xdepois = x/boardCanvas.WIDTH;
                int ydepois = y/boardCanvas.HEIGHT;
                
                boardCanvas.setShot(xdepois,ydepois);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        
    }
}
