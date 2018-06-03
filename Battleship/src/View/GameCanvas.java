/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Block;
import Model.ArcMap;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.Buffer;
import javax.imageio.ImageIO;

import javax.swing.ImageIcon;

public class GameCanvas extends Canvas {

	public static final int AREA = 40;

	private int margin = 0;

	private int rows;
	private int cols;
	private ArcMap achive;
        private Block block;

	private int[][] explosionMatrix;

	public GameCanvas(ArcMap archive) {
		this.achive = archive;
		this.rows = archive.getArcWidth();
		this.cols = archive.getArcHeight();
		
		setSize(AREA * cols+10, AREA * rows);
                
                Block block1 = new Block();
                
                
		 setSize(rows*AREA, cols*AREA);
		explosionMatrix = new int[rows][cols];
                
                System.out.println("iiiiiiii");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(explosionMatrix[i][j]);
			}
			System.out.println("");
		}
                
                
                //mostrar
                //explosionMatrix = archive.getArcMatrix();

	}
	
	

	// @Override
	public void paint(Graphics g) {

		
		
		

		// Prepare an ImageIcon ImageIcon icon = new ImageIcon("images/ondas_1.jpg");

		//ImageIcon iconShot = new ImageIcon("images/explosion.png");
		// Prepare anImage object to be used by drawImage()

		//final Image img = icon.getImage();
		//final Image imgShot = iconShot.getImage();
		//this.oque();
		
		/*
		 * 0 = agua 
		 * 1 = embarcação 1  
		 * 2 = embarcação 2
		 * 3 = embarcação 3
		 * 4 = embarcação 4 
		 * 5 = embarcação 5
		 * 6 = tiro na agua
		 */

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
                            //g.drawImage(img, i, j, AREA, AREA, null);
                            switch (explosionMatrix[i][j]) {
                                case 0:
                                    g.setColor(new Color(131, 209, 232));
                                    g.fillRect(i*AREA, j*AREA, AREA,AREA);
                                    break;
                                case 1:
                                    g.setColor(Color.WHITE);
                                    g.fillRect(i*AREA, j*AREA, AREA,AREA);
                                    break;
                                case 2:
                                    g.setColor(Color.PINK);
                                    g.fillRect(i*AREA, j*AREA, AREA,AREA);
                                    break;
                                case 3:
                                    g.setColor(Color.magenta);
                                    g.fillRect(i*AREA, j*AREA, AREA,AREA);
                                    break;
                                case 4:
                                    g.setColor(Color.black);
                                    g.fillRect(i*AREA, j*AREA, AREA,AREA);
                                    break;
                                case 5:
                                    g.setColor(Color.YELLOW);
                                    g.fillRect(i*AREA, j*AREA, AREA,AREA);
                                    break;
                                case 6:
                                    g.setColor(new Color(0, 139, 139));
                                    g.fillRect(i*AREA, j*AREA, AREA,AREA);
                                    break;
                                case 7:
                                    g.setColor(new Color(85, 185, 218));
                                    g.fillRect(i*AREA, j*AREA, AREA,AREA);
                                    break;
                                    
                                default:
                                    break;
                            }
			}

		}
		g.setColor(Color.black);
		g.drawRect(0, 0, rows * AREA, cols * AREA);

		for (int i = 0; i < rows; i++) {
			g.drawLine(i * AREA, 0, i * AREA, AREA * cols);
			for (int j = 0; j < cols; j++) {
				g.drawLine(0, j * AREA, AREA * rows, j * AREA);

			}
		}
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

	public void oque() {
		System.out.println("iiiiiiii");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(explosionMatrix[i][j]);
			}
			System.out.println("");
		}
	}

}
