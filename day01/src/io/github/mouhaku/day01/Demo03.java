/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/3/ITP1_3_B
 */
package io.github.mouhaku.day01;
import java.util.Scanner;

public class Demo03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(true)
        {
            int a = sc.nextInt();
            if(a == 0)
            {
                break;
            }
            System.out.println("Case " + i + ": " + a);
            i++;
        }
    }
}
