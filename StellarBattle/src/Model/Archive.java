
package Model;

import Controller.Board;
import java.io.File;
import java.util.Scanner;


public class Archive {
    
    private int arcWidth;
    private int arcHeight;
    
    private int[][] arcMatriz = new int[arcWidth][arcHeight];
        
    private int arcFirstSpacecraft;
    private int arcSecondSpacecraft;
    private int arcThirdSpacecraft;
    private int arcFourthSpacecraft;
    private int arcFivethtSpacecraft;
    
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
                this.setArcWidth(var);
                var = Integer.parseInt(content[1]);
                this.setArcHeight(var);
                
                System.out.println(getArcWidth());
                
            } else if(row.contains("# matri")){
                
                
                
            }else if(row.contains("# number")){
                if(row.contains("1")){
                    
                } else if(row.contains("2")){
                    
                } else if(row.contains("3")){
                    
                } else if(row.contains("4")){
                    
                } else if(row.contains("5")){
                    
                }
                
            }else if(row.contains("\n")){
                continue;
            }
            
            
        }
        
    }

    public int getArcWidth() {
        return arcWidth;
    }

    public void setArcWidth(int arcWidth) {
        this.arcWidth = arcWidth;
    }

    public int getArcHeight() {
        return arcHeight;
    }

    public void setArcHeight(int arcHeight) {
        this.arcHeight = arcHeight;
    }

    public int[][] getArcMatriz() {
        return arcMatriz;
    }

    public void setArcMatriz(int[][] arcMatriz) {
        this.arcMatriz = arcMatriz;
    }

    public int getArcFirstSpacecraft() {
        return arcFirstSpacecraft;
    }

    public void setArcFirstSpacecraft(int arcFirstSpacecraft) {
        this.arcFirstSpacecraft = arcFirstSpacecraft;
    }

    public int getArcSecondSpacecraft() {
        return arcSecondSpacecraft;
    }

    public void setArcSecondSpacecraft(int arcSecondSpacecraft) {
        this.arcSecondSpacecraft = arcSecondSpacecraft;
    }

    public int getArcThirdSpacecraft() {
        return arcThirdSpacecraft;
    }

    public void setArcThirdSpacecraft(int arcThirdSpacecraft) {
        this.arcThirdSpacecraft = arcThirdSpacecraft;
    }

    public int getArcFourthSpacecraft() {
        return arcFourthSpacecraft;
    }

    public void setArcFourthSpacecraft(int arcFourthSpacecraft) {
        this.arcFourthSpacecraft = arcFourthSpacecraft;
    }

    public int getArcFivethtSpacecraft() {
        return arcFivethtSpacecraft;
    }

    public void setArcFivethtSpacecraft(int arcFivethtSpacecraft) {
        this.arcFivethtSpacecraft = arcFivethtSpacecraft;
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
    
    
    
}
