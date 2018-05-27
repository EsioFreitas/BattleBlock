
package Model;

import Controller.Board;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Archive {
    
    private int arcWidth;
    private int arcHeight;
    
    private int[][] arcMatrix;
    private String arcTemporatyMatrix = "";
        
    private int arcFirstSpacecraft;
    private int arcSecondSpacecraft;
    private int arcThirdSpacecraft;
    private int arcFourthSpacecraft;
    private int arcFivethtSpacecraft;
    
    private int var;
    private int cont;
    private int lenth;
    

    
    private Board board = null; 

   
       
    public Archive(String path) throws Exception{
        
        
        Scanner reader = new Scanner( new File(path));
        
        
            
            String row = reader.nextLine();
                        
            
                //Linha das dimenções 
                row = reader.nextLine();                 
                
                String[] content = row.split(" ");
                var = Integer.parseInt(content[0]);
                arcWidth = var;
                var = Integer.parseInt(content[1]);
                arcHeight = var;
                
                row = reader.nextLine();
                row = reader.nextLine();
                
                //Linha da matriz
                //Pegando a matriz da imagem e jogando em uma string
                for(int i = 0; i<arcHeight; i++){
                    row = reader.nextLine();
                    arcTemporatyMatrix += row;
                }
                
                lenth = arcHeight*arcWidth;
                int[] numbers = new int[lenth];

                //Transformando a string em vetor de Int
                for(int i = 0; i<lenth; i++){
                    numbers[i] = Integer.parseInt(arcTemporatyMatrix.substring(i, i+1));
                }
                                
                arcMatrix = new int[arcHeight][arcWidth];
                
                //Transformando o vector em uma matriz
                for(int i = 0; i<arcHeight; i++){
                    for(int j = 0; j<arcWidth; j++){
                        arcMatrix[i][j] = numbers[cont];
                        cont++;
                    }
                }
                
                //pegando numero dos barcos 
                
                
                
               


                
                
                
                
            /*} else if(row.contains("# matri")){
                
                
                
            }else if(row.contains("# number")){
                if(row.contains("1")){
                    row = reader.nextLine();
                    
                    String[] content = row.split(" ");
                    var = Integer.parseInt(content[1]);
                    System.err.println(var);
                    
                } else if(row.contains("2")){
                    
                } else if(row.contains("3")){
                    
                } else if(row.contains("4")){
                    
                } else if(row.contains("5")){
                    
                }*/
                
            
            
            
        
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    