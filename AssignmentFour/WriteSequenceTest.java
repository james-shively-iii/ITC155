
import org.junit.Test;

public class WriteSequenceTest {

	@Test
	void reverse(int n) {
		if (n == 1) {
	    	//recursive case
	    	System.out.print("1 ");
	    } else {
	        System.out.print((n + 1) / 2 + " ");
	        if (n != 2) {
	            reverse(n - 2);
	        }
	        System.out.print((n + 1) / 2 + " ");
	    }
	}
	//I'm still trying to figure out this jUnit testing but it doesn't work.
	//my assignment that was submitted partially, the jUnit test worked on there.
}
