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
public class MagentaBlock extends Block{
     
            public static final int amaunt = 3;

    
   private int point; 
        
        public MagentaBlock(){
            this.point = 50; 
        }

   @Override
    public int getPoint() {
        return point;
    }
}
