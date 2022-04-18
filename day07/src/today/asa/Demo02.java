/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/10/ITP1_10_B
 */
package today.asa;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double C = sc.nextDouble();
        System.out.printf("%.8f%n",area(a,b,C));
        System.out.printf("%.8f%n",perimeter(a,b,C));
        System.out.printf("%.8f%n",a_h(b,C));
    }

    public static double area(double a,double b,double C) {
        return a * b * Math.sin(Math.toRadians(C)) / 2;
    }

    public static double perimeter(double a, double b, double C)
    {
        double c = Math.sqrt(a * a + b * b - (2 * a * b * Math.cos(Math.toRadians(C))));
        return a + b + c;
    }

    public static double a_h(double b,double C) {
        return b * Math.sin(Math.toRadians(C));
    }
}
