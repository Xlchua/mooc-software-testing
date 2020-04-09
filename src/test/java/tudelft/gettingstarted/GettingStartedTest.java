package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

	GettingStarted g;
	
	@BeforeEach
	public void setup()
	{
		g = new GettingStarted();
	}
	
    @Test
    public void addFiveTo20() {
        int result = g.addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = g.addFive(0);
        Assertions.assertEquals(5, result);
    }
    
    @Test
    public void addFiveToMinus20() {
        int result = g.addFive(-20);
        Assertions.assertEquals(-15,result);
    }
    
    @Test
    public void addFiveToMinus5() {
    	int result = g.addFive(-5);
    	Assertions.assertEquals(0, result);
    }
    
    @Test
    public void addFivetoOneThousand() {
    	int result = g.addFive(1000);
    	Assertions.assertEquals(1005, result);
    }
}
