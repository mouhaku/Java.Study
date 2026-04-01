/**
 * 入力
 *1行目に整数Nが与えられる。 続いてN行の入力が与えられる。各行は、空白区切りの１つ以上の文字列で構成される。ただし、空白は連続で現れる場合がある。
 *
 *出力
 *入力の各行について、与えられた文字列を1つの空白区切りで順番に出力せよ。 この問題の採点では、空白の有無を厳密に評価する。行の先頭または末尾に余分な空白を出力しないように注意せよ。
 *
 *制約
 *・0≤N≤100
 *・1行に与えられる文字列に含まれる文字の数は、空白を含めて100文字以下である
 *・各文字列は、英小文字、英大文字、数字で構成される
 */
import java.util.Scanner;
public class MultilineInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 改行を消費

        String[] lines = new String[N];
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            String[] words = line.trim().split("\\s+");
            lines[i] = String.join(" ", words);
        }

        for (String line : lines) {
            System.out.println(line);
        }

        sc.close();
    }
}