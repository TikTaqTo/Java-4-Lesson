package Task18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int minNum = 10;

        int[] allNums = new int[n];

        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = in.nextInt();
        }

        for (int i = 0; i < allNums.length; i++) {
            if(allNums[i] < minNum){
                minNum = allNums[i];
            }
        }

        System.out.println(minNum * minNum);
    }
}
