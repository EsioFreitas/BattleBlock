
package Controller;

import java.awt.Point;
import java.util.ArrayList;

import Model.ArcMap;
import View.GameCanvas;

public class Player {
    
    private String name;
    private int pointers; 
    
    private ArcMap archive;
    private GameCanvas canvas;
    private int[][] explosionMatrix;
    
    private int fleet;
    
    public static final int DESTROY1X1 = 1;
    public static final int DESTROY2X2 = 3;
    public static final int DESTROYROW = 4;
    public static final int DESTROYCOL = 4;
    public static final int SEE2X2 = 2;
    
    public Player(ArcMap archive, GameCanvas canvas){
      this.archive = archive;
      this.fleet = archive.getArcFleet();
      this.canvas = canvas; 
      this.explosionMatrix = canvas.getExplosionMatrix();     
    }
    
    public int weaponry(int id) {
    	float tem = fleet*1.5f;
    	int totalWeapon = (int)tem;
    	
    	int remaining = totalWeapon-id;    	
    	return remaining;
    }
    
  
    public void shot(int x, int y) {
		explosionMatrix[x][y] = 1;

    }
    public void waterShot(int x, int y) {
		explosionMatrix[x][y] = 6;

    }
    
    public void powerSee(int x, int y) {
        explosionMatrix[x][y] = 1;
    }
    
    public void powerDestroy2x2(int x, int y) {
        explosionMatrix[x][y] = 1;
        explosionMatrix[x+1][y] = 1;
        explosionMatrix[x+1][y+1] = 1;
        explosionMatrix[x][y+1] = 1;
    }
    
    public void powerDestroyRow(int x, int y) {
        for(int i =0; i<canvas.getRows(); i++){
            explosionMatrix[i][y] = 1;

        }
    }
    
    public void powerDestroyCol(int x, int y) {
        for(int j=0; j<canvas.getCols();j++){
            explosionMatrix[x][j] = 1;

        }
    }


    public String getName() {
        return name;
    }

    public int getPointers() {
        return pointers;
    }   
    
}
