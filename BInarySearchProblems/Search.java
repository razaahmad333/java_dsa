package BInarySearchProblems;

import java.util.ArrayList;
import java.util.List;

public class Search {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int target = 4;
        int start = 0;
        int end = list.size();

        while (start < end) {
            int mid = (start + end) / 2;

            if (list.get(mid) == target) {
                System.out.println(mid);
                break;
            } else if (list.get(mid) > target) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }
    }
}
