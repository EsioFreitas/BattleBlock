package View;

import Controller.Block;
import Model.ArcMap;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class GameCanvas extends Canvas {

    public static final int AREA = 40;

    private int rows;
    private int cols;
    private ArcMap achive;
    private Block block;

    private int[][] explosionMatrix;

    public GameCanvas(ArcMap archive) {
        this.achive = archive;
        this.rows = archive.getArcWidth();
        this.cols = archive.getArcHeight();

        setSize(AREA * cols + 10, AREA * rows);

        Block block1 = new Block();

        setSize(rows * AREA, cols * AREA);
        explosionMatrix = new int[rows][cols];

    }

    @Override
    public void paint(Graphics g) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                switch (explosionMatrix[i][j]) {
                    case 0:
                        g.setColor(new Color(131, 209, 232));
                        g.fillRect(i * AREA, j * AREA, AREA, AREA);
                        break;
                    case 1:
                        g.setColor(new Color(255,50,37));
                        g.fillRect(i * AREA, j * AREA, AREA, AREA);
                        break;
                    case 2:
                        g.setColor(new Color(251,117,226));
                        g.fillRect(i * AREA, j * AREA, AREA, AREA);
                        break;
                    case 3:
                        g.setColor(new Color(189,13,185));
                        g.fillRect(i * AREA, j * AREA, AREA, AREA);
                        break;
                    case 4:
                        g.setColor(new Color(62,255,0));
                        g.fillRect(i * AREA, j * AREA, AREA, AREA);
                        break;
                    case 5:
                        g.setColor(new Color(255,249,0));
                        g.fillRect(i * AREA, j * AREA, AREA, AREA);
                        break;
                    case 6:
                        g.setColor(new Color(0, 139, 139));
                        g.fillRect(i * AREA, j * AREA, AREA, AREA);
                        break;
                    case 7:
                        g.setColor(new Color(85, 185, 218));
                        g.fillRect(i * AREA, j * AREA, AREA, AREA);
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

}
