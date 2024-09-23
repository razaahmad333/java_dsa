package BInarySearchProblems;

import java.util.*;

public class CountOccurrence {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(114, 55, 95, 131, 77, 111, 141));

        int c = solve(list, 95);
        System.out.println(c);
    }

    static public int chopAtHeight(int H, ArrayList<Integer> A) {
        int chopped = 0;

        for (int t : A) {
            if (t > H) {
                chopped += t - H;
            }
        }

        return chopped;
    }

    static public int solve(ArrayList<Integer> A, int B) {

        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i : A) {
            if (i > max) {
                max = i;
            }

            if (i < min) {
                min = i;
            }
        }

        int left = min;
        int right = max;
        int ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (chopAtHeight(mid, A) >= B) {
                left = mid + 1;
                ans = Math.max(ans, mid);
            } else {
                right = mid - 1;
            }
        }

        return ans;

    }
}
