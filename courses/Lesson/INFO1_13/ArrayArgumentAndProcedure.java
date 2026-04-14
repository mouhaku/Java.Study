/**
 * https://onlinejudge.u-aizu.ac.jp/courses/lesson/9/INFO1/13/INFO1_13_D
 */

import java.util.Scanner;
public class ArrayArgumentAndProcedure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        printArray(a);
        sc.close();
    }

    private static void printArray(int[] a) {
        System.out.print('(');
        for (int i = 0; i < a.length; i++) {
            if(i != a.length - 1) {
                System.out.print(a[i] + ", ");
            }
            else {
                System.out.print(a[i]);
            }
        }
        System.out.println(')');
    }
}