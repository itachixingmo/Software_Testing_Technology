package software_mujava;

import org.junit.Assert;
import org.junit.Test;

public class TestBubbleSort {
	
	@Test
	public void BubbleSort() {
		int except[] = {1,2,2,5,6};
		int arr[] = {1,6,2,2,5};
		Assert.assertArrayEquals(except, BubbleSort.BubbleSort(arr));
	}
}
