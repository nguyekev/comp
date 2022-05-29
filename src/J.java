public class J {

    public static void buildTriangle(int n) {
        int numOfChars = 2 * n;

        System.out.println("Input: " + n);
        System.out.println();
        for (int i = n; i > 0; i--) {
            int x = n - i;
            for(int k = x; k > 0; k--) {
                System.out.print(" ");
            }
            for(int j = 0; j < numOfChars; j++) {
                if (i > 9) {
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }
            numOfChars -= 2;
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
