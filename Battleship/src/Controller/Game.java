
package Controller;

import View.LoserFramer;
import View.WinnerFrame;

public class Game {
    public static final int CONTINUE = 0;
    public static final int GAMEOVER = 1;
    public static final int WINNER = 2;
    
    private int status = 0; 

    public void status(int status){
        if(status == GAMEOVER){
            new LoserFramer().setVisible(true);
            
        } else if (status == WINNER){
            new WinnerFrame().setVisible(true);
        }
        
    }

    public int getStatus() {
        return status;
    }


    
    
    
   
}
