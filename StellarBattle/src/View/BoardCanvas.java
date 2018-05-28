
package View;

import Controller.Board;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import javafx.scene.layout.Border;
import javax.swing.ImageIcon;

public class BoardCanvas extends Canvas {
    
    public static final int WIDTH = 80;
    public static final int HEIGHT = 80;
    public static final int MARGIN = 0;
    
    
    private int rows = 10;//board.getHeight();
    private int cols = 10;//board.getWidth();
    
    private int animationCounter = 0;
    private int animationCounterDirection = 0;
    
    private int [][] explosionMatrix = new int[rows][cols]; 
    
    @Override
    public void paint(Graphics g) {
		
        if(animationCounterDirection == 0) {
                if (animationCounter < 4) {
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
        
        ImageIcon sky = new ImageIcon("./img/sky"+String.valueOf(animationCounter)+".png");
        ImageIcon smoke = new ImageIcon("./img/smoke.png");
        
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
    
    public void setShot(int x, int y) {
		explosionMatrix[x][y] = 6;
	}

}