package Task5;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double allNumber[] = new double[n];

        for (int i = 0, j = 1; i < n; i++, j++) {
            allNumber[i] = pow(j, 2);
            System.out.println(allNumber[i]);
        }
    }
}
