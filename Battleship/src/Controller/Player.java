
package Controller;

import java.awt.Point;
import java.util.ArrayList;

public class Player {
    
    private String name;
    private int pointers; 
    
    private int numberShots;
    private int numberPowerSee;
    private int numberPowerDestroy2x2;
    private int numberPowerDestroyRow;
    private int numberPowerDestroyCol;
    
    private Game game;
    private Board board;
    private ArrayList<Point> tiros;
    private Spacecraft[] fleet;
    
    private int fleetTotal;
    
    
    public Player(Game game, Board board){
        this.game = game;
        this.board = board; // new board(x,y)
        this.fleet = new Spacecraft[5];
        
        this.tiros = new ArrayList<Point>();
        
        fleet[0] = Spacecraft.buildSpacecraft(Spacecraft.FIRSTSPACECRAFT);
        fleet[1] = Spacecraft.buildSpacecraft(Spacecraft.SECONDSPACECRAFT);
        fleet[2] = Spacecraft.buildSpacecraft(Spacecraft.THIRDSPACECRAFT);
        fleet[3] = Spacecraft.buildSpacecraft(Spacecraft.FOURTHSPACECRAFT);
        fleet[4] = Spacecraft.buildSpacecraft(Spacecraft.FIVETHSPACECRAFT);
        
        for (int i=0; i<fleet.length;i++){
            this.fleetTotal += fleet[i].getId()*board.getQuantSpacecraft()[i];
            
        }
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

    public int getNumberShots() {
        return numberShots;
    }

    public int getNumberPowerSee() {
        return numberPowerSee;
    }

    public int getNumberPowerDestroy2x2() {
        return numberPowerDestroy2x2;
    }

    public int getNumberPowerDestroyRow() {
        return numberPowerDestroyRow;
    }

    public int getNumberPowerDestroyCol() {
        return numberPowerDestroyCol;
    }

    public Game getGame() {
        return game;
    }

    public Board getBoard() {
        return board;
    }

    public ArrayList<Point> getTiros() {
        return tiros;
    }

    public Spacecraft[] getFleet() {
        return fleet;
    }

    public int getFleetTotal() {
        return fleetTotal;
    }

    
    
    
    
    
    
    
}
