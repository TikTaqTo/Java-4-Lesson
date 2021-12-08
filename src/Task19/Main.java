package Task19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int maxNum = 0;
        int maxNumIndex = 0;

        int[] allNums = new int[n];

        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = in.nextInt();
        }

        for (int i = 0; i < allNums.length; i++) {
            if (allNums[i] > maxNum) {
                maxNum = allNums[i];
                maxNumIndex = i;
            }
        }
        System.out.println(maxNum + "-" + maxNumIndex);
    }
}
