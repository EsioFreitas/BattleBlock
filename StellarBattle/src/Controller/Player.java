
package Controller;

public class Player {
    
    private String name;
    private int pointers; 
    private int numberShots;
    private int numberPowerSee;
    private int numberPowerDestroy2x2;
    private int numberPowerDestroyRow;
    private int numberPowerDestroyCol;
    
    public Player(){
        
    }
    
    //metodos: shot(), powerSee(), powerDestroy - 2x2;Row;Col-()

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointers() {
        return pointers;
    }

    public void setPointers(int pointers) {
        this.pointers = pointers;
    }

    public int getNumberShots() {
        return numberShots;
    }

    public void setNumberShots(int numberShots) {
        this.numberShots = numberShots;
    }

    public int getNumberPowerSee() {
        return numberPowerSee;
    }

    public void setNumberPowerSee(int numberPowerSee) {
        this.numberPowerSee = numberPowerSee;
    }

    public int getNumberPowerDestroy2x2() {
        return numberPowerDestroy2x2;
    }

    public void setNumberPowerDestroy2x2(int numberPowerDestroy2x2) {
        this.numberPowerDestroy2x2 = numberPowerDestroy2x2;
    }

    public int getNumberPowerDestroyRow() {
        return numberPowerDestroyRow;
    }

    public void setNumberPowerDestroyRow(int numberPowerDestroyRow) {
        this.numberPowerDestroyRow = numberPowerDestroyRow;
    }

    public int getNumberPowerDestroyCol() {
        return numberPowerDestroyCol;
    }

    public void setNumberPowerDestroyCol(int numberPowerDestroyCol) {
        this.numberPowerDestroyCol = numberPowerDestroyCol;
    }
    
    
    
    
    
}
