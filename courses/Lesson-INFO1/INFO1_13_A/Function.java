/**
 * 
 * https://onlinejudge.u-aizu.ac.jp/courses/lesson/9/INFO1/13/INFO1_13_A
 * 
 * 関数
 *以下の処理を行う関数を作成せよ。
 *
 *１つの整数aを引数として受け取るaに1を加算した値を返す
 *
 *入力
 *１つの整数xが与えられる。
 *
 *出力
 *上記の関数にxを渡して得られた値を出力せよ。
 *
 *制約
 *−100≤x≤100
 *
 *入出力例
 *入力例1
 *3
 *出力例1
 *4
 *  
 */

import java.util.Scanner;

public class Function {
    public static int addOne(int a) {
        return a + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(addOne(x));
        scanner.close();
    }
}