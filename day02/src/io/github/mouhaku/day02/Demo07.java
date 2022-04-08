/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/5/ITP1_5_B
 */
package io.github.mouhaku.day02;
import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        int H = sc.nextInt();
        int W = sc.nextInt();
        if(H == 0 && W == 0)
            break;
        for(int i = 0;i < H;i++)
        {
            if(i == 0 || i == (H - 1))
            {
                for(int j = 0;j < W;j++)
                {
                    System.out.print("#");
                }
            }
            else
            {
                for(int j = 0;j < W;j++)
                {
                    if(j == 0 || j == (W - 1))
                    {
                        System.out.print("#");
                    }
                    else
                    {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
            }
        System.out.println();
        }

    }
}
