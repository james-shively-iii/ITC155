import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void test() {
		
		int[] arr = new int[] {30, 20, 10};
		
		assertEquals(SelectionSort.selectionSort(arr), 10, 20, 30);
	}

	//still having issues with these jUnit tests :/
}
