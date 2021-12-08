package Task29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        boolean isNegative = false;

        int[] allNums = new int[n];

        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = in.nextInt();
        }

        System.out.println(isNegative(allNums));
    }

    public static boolean isNegative(int[] allNums) {
        boolean firstNegative = allNums[0] < 0 ? true : false;
        boolean isNiceMassive = true;

        if (firstNegative) {
            for (int i = 1; i < allNums.length; i++) {
                if (i % 2 == 0 && allNums[i] > 0) {
                    isNiceMassive = false;
                    break;
                }
                if (i % 2 != 0 && allNums[i] < 0){
                    isNiceMassive = false;
                    break;
                }
            }
        } else {
            for (int i = 1; i < allNums.length; i++) {
                if (i % 2 == 0 && allNums[i] < -1) {
                    isNiceMassive = false;
                    break;
                }
                if (i % 2 != 0 && allNums[i] > -1){
                    isNiceMassive = false;
                    break;
                }
            }
        }

        if (isNiceMassive) {
            return true;
        }

        return false;
    }
}