package Model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author esio
 */
public class DatePlayerTest {

    public String nickName;
    public int pointers;
    public DatePlayer date;
    public boolean b = false; 

    @Test
    public void testGetPointers() {
        date = new DatePlayer();
        date.setPointers(221);
        assertEquals(221, date.getPointers());  
    }
    @Test
    public void testGetPointersEmpty(){
       date = new DatePlayer();
        assertEquals(0, date.getPointers());
    }

    
    @Test
    public void testSetPointers() {
        date = new DatePlayer();
        int n = -33; 
        
        date.setPointers(n);
        assertEquals(0 , date.getPointers());
    }

    
    @Test
    public void testGetNickname() {
        date = new DatePlayer();
        date.setNickname("Esio");
        assertEquals("Esio", date.getNickname());

    }
    
    @Test
    public void testGetNicknameEmpty(){
        date = new DatePlayer();
        assertEquals(null, date.getNickname());
    }

    
    @Test
    public void testSetNickname() {
        date = new DatePlayer();
        date.setNickname("");
        assertNotEquals("", date.getNickname());
        
    }
 
    void afterTests() {
        date = null;
    }

}
