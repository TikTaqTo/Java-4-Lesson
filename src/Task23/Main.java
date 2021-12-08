package Task23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        boolean iAmAlive = false;

        int[] allNums = new int[n];

        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = in.nextInt();
        }

        for (int i = 0; i < allNums.length; i++) {
            if(allNums[i] == m){
                iAmAlive = true;
            }
        }

        String result = iAmAlive ? "Yes" : "No";

        System.out.println(result);
    }
}
