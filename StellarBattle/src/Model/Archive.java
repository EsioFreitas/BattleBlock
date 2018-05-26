
package Model;

import Controller.Board;
import java.io.File;
import java.util.Scanner;


public class Archive {
    
    private int width = 0;
    private int height = 0;
    
    private int[][] matriz = new int[width][height];
        
    private int firstSpacecraft;
    private int secondSpacecraft;
    private int thirdSpacecraft;
    private int fourthSpacecraft;
    private int fivethtSpacecraft;
    
    private int var;
    
    private Board board = null; 
    
    public void Archive(String path) throws Exception {
        Scanner reader = new Scanner(new File(path));
        
        while(reader.hasNext()){
            String row = reader.nextLine();
            
            board = new Board();
            
            if(row.contains("# width")){
                
                String[] content = row.split(" ");
                var = Integer.parseInt(content[0]);
                board.setWidth(var);
                var = Integer.parseInt(content[1]);
                board.setHeight(var);
                
            } else if(row.contains("# matri")){
                
                
                
            }else if(row.contains("# number")){
                if(row.contains("1")){
                    
                } else if(row.contains("2")){
                    
                } else if(row.contains("3")){
                    
                } else if(row.contains("4")){
                    
                } else if(row.contains("5")){
                    
                }
                
            }
            
            
        }
        
    }
    
    
    

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getFirstSpacecraft() {
        return firstSpacecraft;
    }

    public void setFirstSpacecraft(int firstSpacecraft) {
        this.firstSpacecraft = firstSpacecraft;
    }

    public int getSecondSpacecraft() {
        return secondSpacecraft;
    }

    public void setSecondSpacecraft(int secondSpacecraft) {
        this.secondSpacecraft = secondSpacecraft;
    }

    public int getThirdSpacecraft() {
        return thirdSpacecraft;
    }

    public void setThirdSpacecraft(int thirdSpacecraft) {
        this.thirdSpacecraft = thirdSpacecraft;
    }

    public int getFourthSpacecraft() {
        return fourthSpacecraft;
    }

    public void setFourthSpacecraft(int fourthSpacecraft) {
        this.fourthSpacecraft = fourthSpacecraft;
    }

    public int getFivethtSpacecraft() {
        return fivethtSpacecraft;
    }

    public void setFivethtSpacecraft(int fivethtSpacecraft) {
        this.fivethtSpacecraft = fivethtSpacecraft;
    }
    
    
    
    
    
    
}
