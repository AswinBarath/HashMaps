package sde_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class p1_FrequencyOfElementQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		
		// Input 1
		A.addAll(Arrays.asList(1, 2, 1, 1));
		B.addAll(Arrays.asList(1, 2));
		ArrayList<Integer> soln1 = s.solve(A, B);
		 // Print all values in one line
        System.out.println("Answer ArrayList: " + soln1);		
		A.clear(); B.clear();
		
		// Input 2
		A.addAll(Arrays.asList(2, 5, 9, 2, 8));
		B.addAll(Arrays.asList(3, 2));
		ArrayList<Integer> soln2 = s.solve(A, B);
		 // Print all values in one line
        System.out.println("Answer ArrayList: " + soln2);	
		A.clear(); B.clear();
	}

}

class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> freq = new HashMap<>();        
        for(int a : A) {
            if(freq.containsKey(a)) {
                // freq[A[i]]++;
                int temp = freq.get(a);
                freq.put(a, ++temp);
            } else {
                freq.put(a, 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<B.size(); i++) {
            int b = B.get(i);
            if(freq.containsKey(b)) {
                ans.add(freq.get(b));
            } else {
                ans.add(0);
            }
        }
        return ans;
    }
}

/*
Approach 1 - Wrong
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<B.size(); i++) {
            int b = B.get(i);
            if(!freq.containsKey(b)) {
                freq.put(b, 0);
            } else {
                for(int a : A) {
                    if(a == b) {
                        // freq[B[i]]++;
                        int temp = freq.get(b);
                        freq.put(b, temp++);
                    }
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<B.size(); i++) {
            int b = B.get(i);
            int temp = freq.get(b);
            ans.add(temp);
        }
        return ans;
    }
}

*/