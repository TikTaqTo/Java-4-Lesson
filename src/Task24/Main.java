package Task24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int countElement = 0;
        int sumElement = 0;
        double averageSum = 0;

        int[] allNums = new int[n];

        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = in.nextInt();
        }

        for (int i = 0; i < allNums.length; i++) {
            if (allNums[i] > m) {
                sumElement += allNums[i];
                countElement++;
            }
        }

        averageSum = sumElement / countElement;

        System.out.println(averageSum);
    }
}
