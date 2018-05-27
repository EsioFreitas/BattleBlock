/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerarquivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author esio
 */
public class LerArquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
       FileReader arquivo = new FileReader("/home/esio/Documentos/Faculdade/OO/EPS/EP2-OO/lerArquivos/src/map_1.txt");
       Scanner lerDados = new Scanner(arquivo);
       int var;
       int arcWidth, arcHeight;
        
        while(lerDados.hasNext()){
            
            String row = lerDados.nextLine();
                      
            if(row.contains("# width")){
                
                row = lerDados.nextLine();               
                
                String[] content = row.split(" ");
                var = Integer.parseInt(content[0]);
                arcWidth = var;
                var = Integer.parseInt(content[1]);
                arcHeight = var;
                
                System.out.println(arcHeight);
                System.out.println(arcWidth);

                
            }
            
        }

    }
       
    
    
     
    
}
