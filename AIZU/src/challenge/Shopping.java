/*
https://onlinejudge.u-aizu.ac.jp/challenges/sources/ICPC/Prelim/1616
 */
package challenge;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if (n == 0 && m == 0) {
                return;
            }
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = scanner.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (num[i] + num[j] <= m && num[i] + num[j] > sum)
                        sum = num[i] + num[j];
                }
            }
            if (sum > 0) {
                System.out.println(sum);
            } else {
                System.out.println("NONE");
            }
        }
    }
}
