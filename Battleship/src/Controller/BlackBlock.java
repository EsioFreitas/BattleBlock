/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author esio
 */
public class BlackBlock extends Block{
     
            public static final int amaunt = 4;

    
   private int point; 
        
        public BlackBlock(){
            this.point = 70; 
        }

   @Override
    public int getPoint() {
        return point;
    }
}
