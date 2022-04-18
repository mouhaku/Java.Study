/*
https://onlinejudge.u-aizu.ac.jp/problems/ITP1_10_D
 */
package today.asa;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];
        for(int i = 0;i < n;i++)
        {
            x[i] = sc.nextDouble();
        }
        for(int i = 0;i < n;i++)
        {
            y[i] = sc.nextDouble();
        }
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p_max = 0;
        for(int i = 0;i < n;i++)
        {
            p1 += Math.abs(x[i] - y[i]);
            p2 += Math.abs(x[i] - y[i]) * Math.abs(x[i] - y[i]);
            p3 += Math.abs(x[i] - y[i]) * Math.abs(x[i] - y[i]) * Math.abs(x[i] - y[i]);
            p_max = Math.max(p_max,Math.abs(x[i] - y[i]));
        }
        p2 = Math.sqrt(p2);
        p3 = Math.pow(p3,1.0/ 3.0);
        System.out.printf("%.6f%n%.6f%n%.6f%n%.6f%n",p1,p2,p3,p_max);
    }
}
