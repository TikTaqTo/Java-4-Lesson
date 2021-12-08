package Task26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] allNums = new int[n];

        int maxNum = 0;
        int minNum = 0;
        int temp = 0;

        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = in.nextInt();
        }

        for (int i = 0; i < allNums.length; i++) {
            if(allNums[maxNum] > allNums[i]){
                maxNum = i;
            }
            if(allNums[minNum] < allNums[i]){
                minNum = i;
            }
        }

        temp = allNums[maxNum];

        allNums[maxNum] = allNums[minNum];
        allNums[minNum] = temp;
    }
}
