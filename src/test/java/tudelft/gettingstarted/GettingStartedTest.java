package tudelft.gettingstarted;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

	GettingStarted g;
	
	int expected;
	int actual;
	
	@BeforeEach
	public void setup()
	{
		g = new GettingStarted();
	}
	
	@AfterEach
	public void print()
	{
		System.out.println("Expected: " + expected);
		System.out.println("Actual:" + actual);
		System.out.println("----");
	}
	
    @Test
    public void addFiveTo20() {
        int result = g.addFive(20);
        expected = 25;
        actual = result;
        Assertions.assertEquals(expected,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = g.addFive(0);
        expected = 5;
        actual = result;
        Assertions.assertEquals(expected, result);
    }
    
    @Test
    public void addFiveToMinus20() {
        int result = g.addFive(-20);
        expected = -15;
        actual = result;
        Assertions.assertEquals(expected,result);
    }
    
    @Test
    public void addFiveToMinus5() {
    	int result = g.addFive(-5);
    	expected = 0;
        actual = result;
    	Assertions.assertEquals(expected, result);
    }
    
    @Test
    public void addFivetoOneThousand() {
    	int result = g.addFive(1000);
    	expected = 1005;
        actual = result;
    	Assertions.assertEquals(expected, result);
    }
}
