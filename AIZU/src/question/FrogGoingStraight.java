/*
https://onlinejudge.u-aizu.ac.jp/challenges/sources/PCK/Prelim/0317
 */
package question;

import java.util.Scanner;

public class FrogGoingStraight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int L = sc.nextInt();
        System.out.println(D / L + D % L);
    }
}
