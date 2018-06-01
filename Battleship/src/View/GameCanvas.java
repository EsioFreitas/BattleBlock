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

	private int[][] explosionMatrix;

	public GameCanvas(ArcMap archive) {
		this.achive = archive;
		this.rows = archive.getArcHeight();
		this.cols = archive.getArcWidth();
		
		setSize(AREA * cols, AREA * rows);
                
                
		this.setLocation(800, 1000);
                
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
                explosionMatrix = archive.getArcMatrix();

	}
	
	

	// @Override
	public void paint(Graphics g) {

		g.setColor(new Color(131, 209, 232));
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				g.fillRect(i*AREA, j*AREA, AREA,AREA);

			}
		}
		
		

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
				if (explosionMatrix[i][j] == 0) {
					g.setColor(new Color(131, 209, 232));
					g.fillRect(i*AREA, j*AREA, AREA,AREA);
				} else if (explosionMatrix[i][j] == 1) {
					g.setColor(Color.WHITE);
					g.fillRect(i*AREA, j*AREA, AREA,AREA);
				} else if (explosionMatrix[i][j] == 2) {
					g.setColor(Color.PINK);
					g.fillRect(i*AREA, j*AREA, AREA,AREA);
				}else if (explosionMatrix[i][j] == 3) {
					g.setColor(Color.BLACK);
					g.fillRect(i*AREA, j*AREA, AREA,AREA);
				}else if (explosionMatrix[i][j] == 4) {
					g.setColor(Color.GREEN);
					g.fillRect(i*AREA, j*AREA, AREA,AREA);
				}else if (explosionMatrix[i][j] == 5) {
					g.setColor(Color.YELLOW);
					g.fillRect(i*AREA, j*AREA, AREA,AREA);
				}else if (explosionMatrix[i][j] == 6) {
                                    g.setColor(new Color(32, 156, 185));
                                    g.fillRect(i*AREA, j*AREA, AREA,AREA);
				}
			}

		}
		g.setColor(Color.white);
		g.drawRect(0, 0, rows * AREA, cols * AREA);

		for (int i = 0; i < rows; i++) {
			g.drawLine(i * AREA, 0, i * AREA, AREA * cols);
			for (int j = 0; j < cols; j++) {
				g.drawLine(0, j * AREA, AREA * rows, j * AREA);

			}
		}
		

	}

	public void setShot(int x, int y) {
		explosionMatrix[x][y] = 1;
	}

	public int getShot(int x, int y) {
		return explosionMatrix[x][y];
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
