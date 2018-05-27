
package Model;

import Controller.Board;
import java.io.File;
import java.util.Scanner;


public class Archive {
    
    private int arcWidth;
    private int arcHeight;
    
    private String arcTemporatyMatrix = "";
    private int[][] arcMatrix;
        
    private int arcFirstSpacecraft;
    private int arcSecondSpacecraft;
    private int arcThirdSpacecraft;
    private int arcFourthSpacecraft;
    private int arcFivethSpacecraft;
    
    private int var;
    private int cont;
    private int lenth;
    private String[] content;
    

    
    private Board board = null; 

   
       
    public Archive(String path) throws Exception{
        
        
        Scanner reader = new Scanner( new File(path));
        
        
            
            String row = reader.nextLine();
                        
            
                //Linha das dimenções 
                row = reader.nextLine();                 
                
                content = row.split(" ");
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
                row = reader.nextLine();
                row = reader.nextLine();

                System.out.println(row);
                
                row = reader.nextLine();
                content = row.split(" ");
                var = Integer.parseInt(content[1]);
                arcFirstSpacecraft = var;
                System.out.println(arcFirstSpacecraft);
                
                row = reader.nextLine();
                content = row.split(" ");
                var = Integer.parseInt(content[1]);
                arcSecondSpacecraft = var;
                System.out.println(arcSecondSpacecraft);
                
                row = reader.nextLine();
                content = row.split(" ");
                var = Integer.parseInt(content[1]);
                arcThirdSpacecraft = var;
                System.out.println(arcThirdSpacecraft);
                
                row = reader.nextLine();
                content = row.split(" ");
                var = Integer.parseInt(content[1]);
                arcFourthSpacecraft = var;
                System.out.println(arcFourthSpacecraft);
                
                row = reader.nextLine();
                content = row.split(" ");
                var = Integer.parseInt(content[1]);
                arcFivethSpacecraft = var;
                System.out.println(arcFivethSpacecraft);
    }
}
    
    
    
    
    
    
    
    
    
    
    
    