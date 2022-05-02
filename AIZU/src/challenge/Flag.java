/*
https://onlinejudge.u-aizu.ac.jp/challenges/sources/PCK/Final/0368
 */
package challenge;

import java.util.Scanner;

public class Flag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        char c = scanner.next().charAt(0);
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                if(i == 0 || i == W - 1)
                {
                    if(j == 0 || j == H - 1)
                    {
                        System.out.print("+");
                    }
                    else
                    {
                        System.out.print("-");
                    }
                }
                else if(j == 0 || j == H - 1)
                {
                    if(i != 0 && i != W - 1)
                    {
                        System.out.print("|");
                    }
                }
                else if(i == W / 2  && j == H / 2)
                {
                    System.out.print(c);
                }
                else
                {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
