import static org.junit.Assert.*;
import org.junit.*;


public class skillDemoTest {
    
    @Test 
    public void additionTest(){
        skilldemo test = new skilldemo(); 

        assertEquals(2, test.addition(20, 2));

    }

}
