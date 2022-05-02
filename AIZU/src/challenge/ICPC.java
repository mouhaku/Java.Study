/*
https://onlinejudge.u-aizu.ac.jp/challenges/sources/ICPC/Prelim/1147
 */
package challenge;

import java.util.Scanner;

public class ICPC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            int n = scanner.nextInt();
            if(n == 0)
            {
                return;
            }
            else
            {
                int[] s = new int[n];
                for (int i = 0; i < n; i++)
                {
                        s[i] = scanner.nextInt();
                }
                int tmp;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - 1; j++) {
                        if(s[j] > s[j + 1])
                        {
                            tmp = s[j];
                            s[j] = s[j + 1];
                            s[j + 1] = tmp;
                        }
                    }
                }
                int sum = 0;
                for (int i = 1; i < n-1; i++) {
                    sum += s[i];
                }
                System.out.println(sum / (n - 2));
            }
        }
    }
}
