
package Controller;

import View.WinnerFrame;

public class Game {
    public static final int GAMEOVER = 1;
    public static final int WINNER = 2;
    
    private int status = 0; 

    public void status(int status){
        if(status == GAMEOVER){
            
            
        } else if (status == WINNER){
            new WinnerFrame().setVisible(true);
        }
        
    }

    public int getStatus() {
        return status;
    }


    
    
    
   
}
