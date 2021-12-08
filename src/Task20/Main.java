package Task20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] allNums = new int[n];

        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = in.nextInt();
        }

        int maxNum = allNums[0];
        int minNum = allNums[0];

        for (int i = 0; i < allNums.length; i++) {
            if(allNums[i] > maxNum){
                maxNum = allNums[i];
            }
            if(allNums[i] < minNum){
                minNum = allNums[i];
            }
        }

        System.out.println(minNum + " " + maxNum);
    }
}
