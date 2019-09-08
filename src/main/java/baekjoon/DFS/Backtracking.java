package baekjoon.DFS;

import java.util.ArrayList;
import java.util.List;

public class Backtracking {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        backtrack(nums, ret, tmp, 0);
        return ret;
    }

    public static void backtrack(int[] nums, List<List<Integer>> ret, List<Integer> tmp, int dept) {
        for (int i = 0; i < dept; i++) {
            System.out.print("\t");
        }

        System.out.println(tmp);

        //base case
        if (tmp.size() == nums.length) {
            ret.add(new ArrayList<Integer>(tmp));
            return;
        }
        //recursion
        for (int num : nums) {
            if (tmp.contains(num)) {
                continue;
            }
            tmp.add(num);
            backtrack(nums, ret, tmp, dept + 1);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }
}
