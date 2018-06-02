
package Controller;

import java.awt.Point;

public class Block {
    
        public static final int FIRSTSPACECRAFT = 1;
	public static final int SECONDSPACECRAFT = 2;
	public static final int THIRDSPACECRAFT = 3;
	public static final int FOURTHSPACECRAFT = 4;
	public static final int FIVETHSPACECRAFT = 5;
        
        private int size; 
        private int id;
        
        private Block(int size, int id){
            this.size = size;
            this.id = id;
        }
        
        public static Block buildSpacecraft(int id){
            switch(id){
                case FIRSTSPACECRAFT:
                    return new Block(1,1);
                case SECONDSPACECRAFT:
                    return new Block(2, 2);
                case THIRDSPACECRAFT:
                    return new Block(3, 3);
                case FOURTHSPACECRAFT:
                    return new Block(4, 4);
                case FIVETHSPACECRAFT:
                    return new Block(5, 5);
                default:
                    return null; 
            }
        }

    public int getSize() {
        return size;
    }

    public int getId() {
        return id;
    }
        
        
        
}
