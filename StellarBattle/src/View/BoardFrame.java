
package View;

import Controller.Board;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import javafx.scene.layout.Border;
import javax.swing.ImageIcon;

public class BoardFrame extends Canvas {
    
    public static final int WIDTH = 40;
    public static final int HEIGHT = 40;
    public static final int MARGIN = 0;
    
    private Board board; 
    
    private int rows = 10;//board.getHeight();
    private int cols = 10;//board.getWidth();
    
    private int animationCounter = 0;
    private int animationCounterDirection = 0;
    
    private int [][] explosionMatrix = new int[rows][cols];
    
    public BoardFrame(Board board){
        this.board = board;
    }
    
    
    @Override
    public void paint(Graphics g) {
		
        if(animationCounterDirection == 0) {
                if (animationCounter < 15) {
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
        
        ImageIcon sky = new ImageIcon("View/img/sky/sky"+String.valueOf(animationCounter)+".png");
        ImageIcon smoke = new ImageIcon("View/img/smoke/smoke.png");
        
        final Image imgSky = sky.getImage();
        final Image imgSmoke = smoke.getImage();
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                g.drawImage(imgSky, i*WIDTH+MARGIN, j*HEIGHT+MARGIN, WIDTH, HEIGHT, null);
                if(explosionMatrix[i][j] == 6){
                    g.drawImage(imgSmoke, i*WIDTH+MARGIN, j*HEIGHT+MARGIN, WIDTH, HEIGHT, null);
                }
            }
        }
    
    
    
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
    
}