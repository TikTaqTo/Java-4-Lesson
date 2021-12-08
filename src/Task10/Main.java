package Task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;
        double averageSum = 0.0;

        int[] allNums = new int[n];

        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = in.nextInt();
        }

        for (int i = 0; i < allNums.length; i++) {
            sum += allNums[i];
        }

        averageSum = sum / allNums.length;

        System.out.println(sum);
        System.out.println(averageSum);

    }
}
