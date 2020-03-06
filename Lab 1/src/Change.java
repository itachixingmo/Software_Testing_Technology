package software_testing;

public class Change {
	int array[] = {50,20,10,5,5,1,1,1};
	public int change(int n) {
		if(n == 0) return 0;
		for(int i = 0; i < array.length; i++) {
			if(n - array[i]==0) {
				return 0;
			}
			if(n - array[i]>0) {
				n -= array[i];
			}
		}
		return -1;
	}
}
