public class JumpLevel3 {
    public static void main(String[] args) {
        int A = 4;

        // 4 4 4 4 4 4 4
        // 4 3 3 3 3 3 4
        // 4 3 2 2 2 3 4
        // 4 3 2 1 2 3 4
        // 4 3 2 2 2 3 4
        // 4 3 3 3 3 3 4
        // 4 4 4 4 4 4 4

        // 1 => 5
        // 2 => 4
        // 3 => 3
        // 4 => 2
        // 5 => 1

        for (int i = 1; i < 2 * A; i++) {
            for (int j = 1; j < 2 * A; j++) {

                for(int h = 1; h<=A; h++){
                    if (i == h || i == 2 * A - h || j == h || j == 2 * A - h) {
                        System.out.print(A - h + 1 + " ");
                        break;
                    } 
                }
            }

            System.err.println();
        }

    }
}
