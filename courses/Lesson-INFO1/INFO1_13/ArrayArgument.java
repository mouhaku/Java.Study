/**
 * https://onlinejudge.u-aizu.ac.jp/courses/lesson/9/INFO1/13/INFO1_13_C
 */

import java.util.Scanner;
public class ArrayArgument {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(a[0]);
        sc.close();
    }
}