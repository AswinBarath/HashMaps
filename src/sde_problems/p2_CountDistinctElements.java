package sde_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class p2_CountDistinctElements {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Solution s = new Solution();

        ArrayList<Integer> A = new ArrayList<>();

        // Input 1
        A.addAll(Arrays.asList(3, 4, 3, 6, 6));
        ArrayList<Integer> soln1 = s.solve(A);
        // Print all values in one line
        System.out.println("Answer ArrayList: " + soln1);
        A.clear();

        // Input 2
        A.addAll(Arrays.asList(3, 3, 3, 9, 0, 1, 0));
        ArrayList<Integer> soln2 = s.solve(A);
        // Print all values in one line
        System.out.println("Answer ArrayList: " + soln2);
        A.clear();

    }
}

class Solution {
    public int solve(ArrayList<Integer> A) {
        HashSet<Integer> distinct = new HashSet<>();
        for(int a : A) {
            distinct.add(a);
        }
        return distinct.size();
    }
}
