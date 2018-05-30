
package Controller;

public class Game {
    public static final int FINISHED = 1;
    
    private int status = 0; 

    public void status(int status){
        if(status == FINISHED){
            
        }
        this.status = status;
    }

    public int getStatus() {
        return status;
    }


    
    
    
   
}
