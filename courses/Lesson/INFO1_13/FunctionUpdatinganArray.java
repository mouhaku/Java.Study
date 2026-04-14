/**
 * https://onlinejudge.u-aizu.ac.jp/courses/lesson/9/INFO1/13/INFO1_13_F
 */

import java.util.Scanner;

public class FunctionUpdatinganArray {
    public static void updateArray(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            a[i] *= k;
        }
    }

    // 修复了空数组崩溃的 Bug，并使用双引号增强安全性
    public static void printArray(int[] a) {
        System.out.print("(");
        // 先检查数组是否有元素，防止 a.length - 1 变成 -1 导致越界
        if (a.length > 0) {
            for (int i = 0; i < a.length; i++) {
                if (i != a.length - 1) {
                    System.out.print(a[i] + ", ");
                } else {
                    System.out.print(a[i]);
                }
            }
        }
        System.out.println(")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 防御性编程：确保输入的是数字
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            // 如果输入的长度小于 0，做个安全处理
            if (n < 0) {
                n = 0; 
            }
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    a[i] = sc.nextInt();
                }
            }
            
            if (sc.hasNextInt()) {
                int k = sc.nextInt();
                printArray(a);
                updateArray(a, k);
                printArray(a);
            }
        }
        sc.close();
    }
}
