package hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int arr[] = {0,3,7,2,5,8,4,6,0,1};
		System.out.println(longestConsecutiveSequence(arr));
	}
	
	public static int longestConsecutiveSequence(int[] nums) {
		Set<Integer> hashSet = new HashSet<Integer>();
		for(int num : nums) {
			hashSet.add(num);
		}
		
		int longestStreak = 0;
		
		for(int num : nums) {
			if(!hashSet.contains(num-1)) {
				int currentNum = num;
				int currentStreak = 1;
				
				while(hashSet.contains(currentNum+1)) {
					currentNum += 1;
					currentStreak += 1;
				}
				
				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}
		
		return longestStreak;
	}

}
