package sde_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class p2_CountDistinctElements {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Solution1 s = new Solution1();

        ArrayList<Integer> A = new ArrayList<>();

        // Input 1
        A.addAll(Arrays.asList(3, 4, 3, 6, 6));
        System.out.println("Answer: " + s.solve(A));
        A.clear();

        // Input 2
        A.addAll(Arrays.asList(3, 3, 3, 9, 0, 1, 0));
        System.out.println("Answer: " + s.solve(A));
        A.clear();

    }
}

class Solution1 {
    public int solve(ArrayList<Integer> A) {
        HashSet<Integer> distinct = new HashSet<>();
        for(int a : A) {
            distinct.add(a);
        }
        return distinct.size();
    }
}
