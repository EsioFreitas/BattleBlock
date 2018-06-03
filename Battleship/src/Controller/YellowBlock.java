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
public class YellowBlock extends Block{
     
    public static final int amaunt = 5;

    
   private int point; 
        
        public YellowBlock(){
            this.point = 100; 
        }

   @Override
    public int getPoint() {
        return point;
    }
}
