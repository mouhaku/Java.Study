/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/6/ITP1_6_B
 */
package io.github.mouhaku.day04;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ewsz = new int[4][13];

        for(int i = 0;i < 4;i++)
        {
            for(int j = 0;j < 13;j++)
            {
                ewsz[i][j] = 0;
            }
        }

        for(int i = 0;i < n;i++)
        {
            char cr = sc.next().charAt(0);
            int s = sc.nextInt();

            switch(cr)
            {
                case 'S':
                    ewsz[0][s - 1] = 1;
                    break;
                case 'H':
                    ewsz[1][s - 1] = 1;
                    break;
                case 'C':
                    ewsz[2][s - 1] = 1;
                    break;
                case 'D':
                    ewsz[3][s - 1] = 1;
                    break;
            }
        }
        for(int i = 0;i < 4;i++)
        {
            for(int j = 0;j < 13;j++)
            {
                if(ewsz[i][j] == 0)
                {
                    switch (i)
                    {
                        case 0:
                            System.out.println("S " + (j + 1));
                            break;
                        case 1:
                            System.out.println("H " + (j + 1));
                            break;
                        case 2:
                            System.out.println("C " + (j + 1));
                            break;
                        case 3:
                            System.out.println("D " + (j + 1));
                            break;
                    }
                }
            }
        }
    }
}
