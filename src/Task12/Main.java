package Task12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //!!
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;
        int col = 0;
        double averageSum = 0;

        int[] allNums = new int[n];

        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = in.nextInt();
        }

        for (int i = 0; i < allNums.length; i++) {
            if (allNums[i] < 0) {
                sum += allNums[i];
                col++;
            }
        }

        averageSum = sum / col;

        System.out.printf("%.2f", averageSum);
    }
}
