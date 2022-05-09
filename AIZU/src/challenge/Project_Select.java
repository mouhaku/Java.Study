/*
https://onlinejudge.u-aizu.ac.jp/challenges/sources/ICPC/Prelim/1608
 */
package challenge;

import java.util.Scanner;

public class Project_Select {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                return;
            }
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int difference = Math.abs(a[0] - a[1]);
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n; j++) {
                    if(i == j)
                    {
                        continue;
                    }
                    if(Math.abs(a[j] - a[i]) < difference)
                    {
                        difference = Math.abs(a[j] - a[i]);
                    }
                }
            }
            System.out.println(difference);
        }
    }
}
