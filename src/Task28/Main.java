package Task28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] allNums = new int[n];
        int startPos = -1;
        int endPos = -1;

        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = in.nextInt();
        }

        for (int i = 0, j = allNums.length - 1; i < allNums.length; i++, j--) {
            if (allNums[i] == 0) {
                startPos = i;
            }
            if (allNums[j] == 0) {
                endPos = j;
            }
            if (startPos != -1 && endPos != -1) {
                break;
            }
        }

        int sum = 0;

        for (int i = startPos; i < endPos; i++) {
            sum += allNums[i];
        }

        System.out.println(sum);
    }
}
