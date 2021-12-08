package Task27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = 0;

        int[] allNums = new int[n];

        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = in.nextInt();
        }

        for (int i = 0; i < allNums.length; i++) {
            if (allNums[i] % 2 == 0) {
                m++;
            }
        }

        int[] reverseNums = new int[m];

        for (int i = 0, j = 0; i < allNums.length; i++) {
            if (allNums[i] % 2 == 0) {
                reverseNums[j] = allNums[i];
                j++;
            }
        }
    }
}
