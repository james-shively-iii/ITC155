import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WriteCharsTest {
	
	WriteChars wc = new WriteChars();
	
	@Before
	public void beforeTestMethod() {
        System.out.println("@Before - beforeTestMethod");
    }

	@Test
	public static void testWriteChars() {
		System.out.println("Testing with jUnit is tough, but rewarding");
		assertEquals(wc.writeChars(8), "<<<**>>>");
	}

	@After
    public void afterTestMethod() {
        System.out.println("@After - afterTestMethod");
    }

	//Still can't figure this jUnit test out.  I thought I really had it this time, but it still isn't
	//providing me with the proper feedback.  I will continue to attempt to make it work but after hours
	//of trying, sometimes you need to admit defeat.
}
