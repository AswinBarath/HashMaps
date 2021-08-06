package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		int[] nums = {1,0,-1,0,-2,2};
		int target = 0;
//		int[] nums = {2,2,2,2,2};
//		int target = 8;
		List<List<Integer>> ans = fourSum(nums, target);
		for(List<Integer> quad : ans) {
			System.out.println(quad);
		}
	}
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
	    
		ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
		
		if(nums == null || nums.length == 0) return res;
		
		int n = nums.length;
		
		Arrays.sort(nums);
		
		for(int i=0; i<n; i++ ) {
			
			for(int j=i+1; j<n; j++) {
				
				int target_2  = target - (nums[i] + nums[j]);
				
				int left = j + 1;
				int right = n - 1;
				
				while(left<right) {
					
					int two_sum = nums[left] + nums[right];
					
					if(two_sum < target_2) left++;
					
					else if(two_sum > target_2) right--;
					
					else {
						
						List<Integer> quad = new ArrayList<>();
						quad.add(nums[i]);
						quad.add(nums[j]);
						quad.add(nums[left]);
						quad.add(nums[right]);
						res.add(quad);

						// Processing the duplicates of left and right
						while( left < right && nums[left] == quad.get(2) ) ++left;
						while( left < right && nums[right] == quad.get(3) ) --right;
					}
				}
				
				// Processing the duplicates of j
				while( j+1 < n && nums[j+1] == nums[j] ) ++j;
			}
			// Processing the duplicates of i
			while( i+1 < n && nums[i+1] == nums[i] ) ++i;
		}
		
		return res;
		
	}
	

}
