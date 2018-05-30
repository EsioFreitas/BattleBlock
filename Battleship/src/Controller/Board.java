
package Controller;

import Model.ArcMap;
import java.awt.Point;

public class Board {
    
    private int width;
    private int height;
    
    private int[][] map = new int[width][height];
    
    private int totalNumberSpacecraft;
    
    private int[] quantSpacecraft = new int[5]; 

    private Point posicao = null;
    
    public Board(ArcMap archive){
        this.width = archive.getArcWidth();
        this.height = archive.getArcHeight();
        
        this.map = archive.getArcMatrix();
    
        quantSpacecraft[0] = archive.getArcFirstSpacecraft();
        quantSpacecraft[1] = archive.getArcSecondSpacecraft();
        quantSpacecraft[2] = archive.getArcThirdSpacecraft();
        quantSpacecraft[3] = archive.getArcFourthSpacecraft();
        quantSpacecraft[4] = archive.getArcFivethSpacecraft();
        
        for(int i=0;i<5;i++){
            totalNumberSpacecraft += quantSpacecraft[i];
            System.out.println(totalNumberSpacecraft);
        }
         
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return map;
    }  

    public int[][] getMap() {
        return map;
    }

    public int[] getQuantSpacecraft() {
        return quantSpacecraft;
    }

    public Point getPosicao() {
        return posicao;
    }
    public int getPosicao(int x, int y) {
		return map[x][y];
	}
    
}
