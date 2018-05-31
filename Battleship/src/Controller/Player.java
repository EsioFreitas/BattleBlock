
package Controller;

import java.awt.Point;
import java.util.ArrayList;

import Model.ArcMap;

public class Player {
    
    private String name;
    private int pointers; 
    
    private ArcMap archive;
    
    private int fleet;
    
    
    public Player(ArcMap archive){
      this.archive = archive;
      this.fleet = archive.getArcFleet();
      
    }
    
    public void weaponry(int id) {
    	float tem = fleet*1.5f;
    	int totalWeapon = (int)tem ;
    	
    	
    }
    
    //metodos: shot(), powerSee(), powerDestroy - 2x2;Row;Col-()
    /*
    public void setShot(int x, int y) {
        explosionMatrix[x][y] *= 2;
    }
    
    **public void setPowerSee(int x, int y) {
        explosionMatrix[x][y] *= 2;
    }
    
    public void setPowerDestroy2x2(int x, int y) {
        explosionMatrix[x][y] *= 2;
        explosionMatrix[x+1][y] *= 2;
        explosionMatrix[x+1][y+1] *= 2;
        explosionMatrix[x][y+1] *= 2;
    }
    
    public void setPowerDestroyRow(int x, int y) {
        for(int i =0; i<rows; i++){
            explosionMatrix[i][y] *= 2;

        }
    }
    
    public void setPowerDestroyCol(int x, int y) {
        for(int j=0; j<col;j++){
            explosionMatrix[x][j] *= 2;

        }
    }
    
    
    
    */

    public String getName() {
        return name;
    }

    public int getPointers() {
        return pointers;
    }   
    
}
