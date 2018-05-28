
package Controller;

import Model.Archive;

public class Board {
    private int width;
    private int height;
    
    private int[][] matrix = new int[width][height];
    
    private int totalNumberSpacecraft;
    
    private int firstSpacecraft;
    private int secondSpacecraft;
    private int thirdSpacecraft;
    private int fourthSpacecraft;
    private int fivethSpacecraft;
    
    public Board(Archive archive){
        width = archive.getArcWidth();
        height = archive.getArcHeight();
        
        matrix = archive.getArcMatrix();
    
        firstSpacecraft = archive.getArcFirstSpacecraft();
        secondSpacecraft = archive.getArcSecondSpacecraft();
        thirdSpacecraft = archive.getArcThirdSpacecraft();
        fourthSpacecraft = archive.getArcFourthSpacecraft();
        fivethSpacecraft = archive.getArcFivethSpacecraft();
         
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getTotalNumberSpacecraft() {
        return totalNumberSpacecraft;
    }

    public int getFirstSpacecraft() {
        return firstSpacecraft;
    }

    public int getSecondSpacecraft() {
        return secondSpacecraft;
    }

    public int getThirdSpacecraft() {
        return thirdSpacecraft;
    }

    public int getFourthSpacecraft() {
        return fourthSpacecraft;
    }

    public int getFivethSpacecraft() {
        return fivethSpacecraft;
    }
    
    
    
    
    
    
    
    
  
    
}
