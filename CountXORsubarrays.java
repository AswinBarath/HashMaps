package hashing;

import java.util.HashMap;

public class CountXORsubarrays {

	public static void main(String[] args) {
		
		System.out.println(countXOR(new int[] {4,2,2,6,4}, 6));
	}
	
	public static int countXOR(int[] A, int B) {
		HashMap<Integer, Integer> freq = new HashMap<>();
		int cnt = 0;
		int xorr = 0;
		int n = A.length;
		for(int i=0; i<n; i++) {
			xorr = xorr ^ A[i];
			if(freq.get(xorr ^ B) != null)
				cnt += freq.get(xorr ^ B);
			if(xorr==B)
				cnt++;
			if(freq.get(xorr) != null)
				freq.put(xorr,  freq.get(xorr) + 1);
			else freq.put(xorr, 1);
		}
		return cnt;
	}
	

}
