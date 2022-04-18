/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/10/ITP1_10_C
 */
package today.asa;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else {
                double[] score = new double[n];
                double s = 0;
                for (int i = 0; i < n; i++) {
                    score[i] = sc.nextDouble();
                    s += score[i];
                }
                double average = s / n;
                double T = 0;
                for (int i = 0; i < n; i++) {
                    T += (score[i] - average) * (score[i] - average);
                }
                double alpha = Math.sqrt(T / n);
                System.out.printf("%.8f%n",alpha);

            }
        }
    }
}
