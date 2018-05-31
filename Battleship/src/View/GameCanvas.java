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

	private int[][] explosionMatrix = new int[rows][cols];

	public GameCanvas(ArcMap archive) {
		this.achive = archive;
		this.rows = archive.getArcHeight();
		this.cols = archive.getArcWidth();
		explosionMatrix = archive.getArcMatrix();
		setSize(AREA * cols, AREA * rows);
		setLocation(0, 0);
		// setSize(AREA, AREA);

	}

	// @Override
	public void paint(Graphics g) {

		g.setColor(new Color(131, 209, 232));
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				g.fillRect(i*AREA, j*AREA, AREA,AREA);

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

		this.oque();

		// Prepare an ImageIcon ImageIcon icon = new ImageIcon("images/ondas_1.jpg");

		//ImageIcon iconShot = new ImageIcon("images/explosion.png");
		// Prepare anImage object to be used by drawImage()

		//final Image img = icon.getImage();
		//final Image imgShot = iconShot.getImage();
		this.oque();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				//g.drawImage(img, i, j, AREA, AREA, null);
				if (explosionMatrix[i][j] == 1) {
					g.setColor(Color.white);

					g.fillRect(i*AREA, j*AREA, AREA,AREA);
				}
			}

		}
		

	}

	public void changeMatrix(int i, int j, GameCanvas canvas) {

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
		System.out.println("");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(explosionMatrix[i][j]);
			}
			System.out.println("");
		}
	}

}
