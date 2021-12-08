package Task25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] allNums = new int[n];

        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = in.nextInt();
        }

        for (int i = allNums.length; i >= 0; i--) {
            System.out.println(allNums[i]);
        }
    }
}
