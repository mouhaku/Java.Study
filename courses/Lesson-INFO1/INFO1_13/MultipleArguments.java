/**
 * https://onlinejudge.u-aizu.ac.jp/courses/lesson/9/INFO1/13/INFO1_13_B
 */

import java.util.Scanner;

public class MultipleArguments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 
        String c = sc.nextLine();       
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
        sc.close();
    }
}