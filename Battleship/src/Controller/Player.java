
package Controller;

import java.awt.Point;
import java.util.ArrayList;

import Model.ArcMap;
import View.ChoosePowersPanel;
import View.GameCanvas;

public class Player {
    
    private String name;
    private int pointers; 
    
    private ArcMap archive;
    private GameCanvas canvas;
    private ChoosePowersPanel choose;
    
    private int[][] explosionMatrix;
    
    private int fleet;
    
    public static final int DESTROY1X1 = 0;
    public static final int DESTROY2X2 = 1;
    public static final int DESTROYROW = 2;
    public static final int DESTROYCOL = 3;
    public static final int SEE2X2 = 4;
    
    private int id = 0;
    
    private int amauntShots;
    private int power;
    private int amauntpowerDestroy2x2 = 1;
    private int amauntpowerDestroyRow = 1;
    private int amauntpowerDestroyCol = 1;
    private int amauntpowerSee = 1;
    
     
    
    public Player(ArcMap archive, GameCanvas canvas){
      this.archive = archive;
      this.fleet = archive.getArcFleet();
      this.canvas = canvas; 
      this.explosionMatrix = canvas.getExplosionMatrix();     
    }
    
    public void amountShots() {
    	float shots = fleet*1.5f;
    	int totalWeapon = (int)shots;
        this.amauntShots = totalWeapon;
    }
    
    //
    
    public void shot(int x, int y){
        switch(id){
            case 0: 
                shotBlock(x, y);
                amauntShots -= 1;
                break;
            case 1:
                powerDestroy2x2(x, y);
                amauntpowerDestroy2x2 -= 1;
                break;
            case 2:
                powerDestroyRow(x, y);
                amauntpowerDestroyRow -= 1;
                break;
            case 3: 
                powerDestroyCol(x, y);
                amauntpowerDestroyCol-= 1;
                break;
            case 4: 
                powerSee(x, y);
                amauntpowerSee -= 1;
                break;
            default:
                break;
        }
    }
    
  
    public void shotBlock(int x, int y) {
        if(archive.getPosition(explosionMatrix, x, y) == 0){
            explosionMatrix[x][y] = 6;
        } else
            explosionMatrix[x][y] = archive.getPosition(explosionMatrix, x, y);

    }
    public int Attention(int x, int y) {
            return explosionMatrix[x][y] = 7;
    }
    public void waterShot(int x, int y) {
		explosionMatrix[x][y] = 6;

    }
    
    public void powerSee(int x, int y) {
        if(archive.getPosition(explosionMatrix, x, y) == 0){
            explosionMatrix[x][y] = 0;
        } else
            explosionMatrix[x][y] = 7;
        
        if(archive.getPosition(explosionMatrix, x+1, y) == 0){
            explosionMatrix[x+1][y] = 0;
        } else
            explosionMatrix[x+1][y] = 7;
        
        if(archive.getPosition(explosionMatrix, x+1, y+1) == 0){
            explosionMatrix[x+1][y+1] = 0;
        } else
            explosionMatrix[x+1][y+1] = 7;
        
        if(archive.getPosition(explosionMatrix, x, y+1) == 0){
            explosionMatrix[x][y+1] = 0;
        } else
            explosionMatrix[x][y+1] = 7;
    }
    
    public void powerDestroy2x2(int x, int y) {
        if(archive.getPosition(explosionMatrix, x, y) == 0){
            explosionMatrix[x][y] = 6;
        } else
            explosionMatrix[x][y] = archive.getPosition(explosionMatrix, x, y);
        
        if(archive.getPosition(explosionMatrix, x+1, y) == 0){
            explosionMatrix[x+1][y] = 6;
        } else
            explosionMatrix[x+1][y] = archive.getPosition(explosionMatrix, x+1, y);
        
        if(archive.getPosition(explosionMatrix, x+1, y+1) == 0){
            explosionMatrix[x+1][y+1] = 6;
        } else
            explosionMatrix[x+1][y+1] = archive.getPosition(explosionMatrix, x+1, y+1);
        
        if(archive.getPosition(explosionMatrix, x, y+1) == 0){
            explosionMatrix[x][y+1] = 6;
        } else
            explosionMatrix[x][y+1] = archive.getPosition(explosionMatrix, x, y+1);
    }
    
    public void powerDestroyRow(int x, int y) {
        for(int i =0; i<canvas.getRows(); i++){
            if(archive.getPosition(explosionMatrix, i, y) > 0){
                explosionMatrix[i][y] = archive.getPosition(explosionMatrix, i, y);
            } else
                explosionMatrix[i][y] = 6;
        }

        
    }
    
    public void powerDestroyCol(int x, int y) {
        for(int j=0; j<canvas.getCols();j++){
            if(archive.getPosition(explosionMatrix, x, j) > 0){
                explosionMatrix[x][j] = archive.getPosition(explosionMatrix, x, j);
            } else
                explosionMatrix[x][j] = 6;

        }
    }


    public String getName() {
        return name;
    }

    public int getPointers() {
        return pointers;
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
