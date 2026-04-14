/**
 * https://onlinejudge.u-aizu.ac.jp/courses/lesson/9/INFO1/13/INFO1_13_E
 */

import java.util.Scanner;
public class FunctionReturningAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = readArray(n);
        printArray(a);
        sc.close();
    }

    private static int[] readArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        return a;
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