/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ArcMap;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;

public class GameCanvas extends Canvas {
        
	
	public static final int AREA = 40;
	
	private int margin = 0;
	
	private int rows;
	private int cols;
        private ArcMap achive;
         
	
	private int [][] explosionMatrix = new int[rows][cols];
        
        public GameCanvas(ArcMap archive){
            this.achive = archive;
            this.rows = archive.getArcHeight();
            this.cols = archive.getArcWidth();
            explosionMatrix = archive.getArcMatrix();
            setSize(AREA * rows, AREA *cols);
            //setSize(AREA, AREA);
        }
	
	@Override
	public void paint(Graphics g) {
                int lenthI = rows+1;
                int lenthJ = cols+1;
		g.setColor(Color.BLUE);
		g.drawRect(0, 0, rows+1, cols);
		for (int i = 0; i < lenthI; i++) {
                    g.drawLine(i * AREA, 0, i * AREA, AREA*rows);
                    for(int j =0; j<lenthJ; j++){
			g.drawLine(0, i * AREA, AREA*cols, i *AREA);
                    }
                        
		}
		
		// Prepare an ImageIcon
		ImageIcon icon = new ImageIcon("images/ondas_1.jpg");
		ImageIcon iconShot = new ImageIcon("images/explosion.png");
		// Prepare an Image object to be used by drawImage()
		final Image img = icon.getImage();
		final Image imgShot = iconShot.getImage();
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {				
				g.drawImage(img, i*AREA, j*AREA, AREA, AREA, null);
				if(explosionMatrix[i][j] == 1) {
					g.drawImage(imgShot, i*AREA, j*AREA, AREA, AREA, null);
				}
			}

		}	
	}
	
    public void setShot(int x, int y) {
            explosionMatrix[x][y] = 1;
    }


    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int[][] getExplosionMatrix() {
        return explosionMatrix;
    }

    public void setExplosionMatrix(int[][] explosionMatrix) {
        this.explosionMatrix = explosionMatrix;
    }

	

	
	
}
