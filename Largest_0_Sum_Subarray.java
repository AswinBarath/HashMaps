package hashing;

import java.util.HashMap;

public class Largest_0_Sum_Subarray {

	public static void main(String[] args) {
		int[] arr = {-1, 1, 3, 2, -2, -8, 1, 7, 10, 23};
		
		System.out.println(maxLen(arr, arr.length));
	}
	
	public static int maxLen(int[] arr, int n) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int maxi = 0;
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
			if(sum==0) {
				maxi = i+1;
			} else {
				if(map.get(sum) != null) {
					maxi = Math.max(maxi, i - map.get(sum));
				} else {
					map.put(sum, i);
				}
			}
		}
		
		return maxi;
	}

}
