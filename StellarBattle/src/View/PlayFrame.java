
package View;

import Controller.Board;
import java.awt.BorderLayout;
import javax.swing.JFrame;


public class PlayFrame extends JFrame {
    
    private Board board;
    
    public PlayFrame(Board board){
        this.board = board;
    }
    
    private BoardFrame boardFrame = new BoardFrame(board);
    //thred
    
    public PlayFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());
        setTitle("Stellar Balle");
        getContentPane().add("Center", boardFrame);
        
        setSize(boardFrame.WIDTH * boardFrame.getRows(), boardFrame.HEIGHT * boardFrame.getCols());
        
        		setVisible(true);

        
    }
}
