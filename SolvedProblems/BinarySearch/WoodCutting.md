### Wood Cutting Made Easy

```java

public class WoodCutting {

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

```

We need to chopp atleast Given amount of meters of wood (B)

We found max and min height of trees, 

did a binary search to find optimal height at which, machine should be set to chop

If we have chopped less meters in total, we decrease the height by moving top(right) pointer down

But if we have chopped more or equal amount,
we store, max of heights at which we chopped, and look for max height, such that chopping could be less.

