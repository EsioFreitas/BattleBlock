
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
    
    
    
    
    
    
    
  
    
}
