package Task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;
        double averageSum = 0;

        int[] allNums = new int[n];

        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = in.nextInt();
        }

        averageSum = sum / allNums.length;

        for (int i = 0; i < allNums.length; i++) {
            if(allNums[i] > averageSum){
                System.out.println(allNums[i]);
            }
        }
    }
}
