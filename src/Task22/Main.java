package Task22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] allNums = new int[n];

        int sum = 0;
        double averageSum = 0;

        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = in.nextInt();
        }

        int maxNum = allNums[0];
        int minNum = allNums[0];

        for (int i = 0; i < allNums.length; i++) {
            if (allNums[i] > maxNum) {
                maxNum = allNums[i];
            }
            if (allNums[i] < minNum) {
                minNum = allNums[i];
            }
        }

        for (int i = 0; i < allNums.length; i++) {
            if (allNums[i] != minNum || allNums[i] != maxNum) {
                sum += allNums[i];
            }
        }

        averageSum = sum / (allNums.length - 2);
    }
}
