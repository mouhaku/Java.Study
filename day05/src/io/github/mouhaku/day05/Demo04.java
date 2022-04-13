/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/7/ITP1_7_B
 */
package io.github.mouhaku.day05;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            int sum = 0;
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n == 0 && x == 0)
            {
                break;
            }
            else
            {
                for(int i = 1;i <= n - 2;i++)
                {
                    for(int j = i + 1;j <= n - 1;j++)
                    {
                        for(int k = j + 1;k <= n;k++)
                        {
                            if(i + j + k == x)
                            {
                                sum++;
                            }
                        }
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
