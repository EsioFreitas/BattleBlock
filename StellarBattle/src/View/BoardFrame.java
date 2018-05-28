
package View;

import Controller.Board;
import java.awt.Canvas;
import java.awt.Graphics;

public class BoardFrame extends Canvas {
    
    public static final int RECT_WIDTH = 80;
    public static final int RECT_HEIGHT = 80;
    public static final int MARGIN = 0;
    
    private Board board; 
    
    private int rows = board.getHeight();
    private int cols = board.getWidth();
    
    private int animationCounter = 0;
    private int animationCounterDirection = 0;
    
    private int [][] explosionMatrix = new int[rows][cols];
    
    @Override
    public void paint(Graphics g) {
		
        if(animationCounterDirection == 0) {
                if (animationCounter < 6) {
                        animationCounter++;
                }
                else {
                        animationCounterDirection = 1;
                }
        }
        else {
                if (animationCounter > 0) {
                        animationCounter--;
                }
                else {
                        animationCounterDirection = 0;
                }
        }

    
    
    
    
    }
}