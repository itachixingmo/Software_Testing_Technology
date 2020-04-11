package software_mujava;

import org.junit.Assert;
import org.junit.Test;

public class TestBackPack {
	
	@Test
	public void BackPack() {
		int m = 10;
        int n = 3;
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int except[]={0,0,4,4,4,4,4,4,4,4,
        		0,0,4,5,5,5,9,9,9,9,
                0,0,4,5,6,6,9,10,11,11};
        int c[][]=BackPack.BackPack_Solution(m,n,w,p);
        int out[]= new int[30];
        for(int i = 0; i<3 ; i++) {
        	for(int j = 0; j<10 ; j++) {
        		out[i*10+j]=c[i+1][j+1];
        	}
        }
        Assert.assertArrayEquals(except, out);
	}
}
