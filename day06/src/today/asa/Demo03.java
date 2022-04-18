/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/8/ITP1_8_C
 */
package today.asa;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        char[][] zm = new char[26][2];
        int[] sum = new int[26];
        while(sc.hasNext()) {
            String str = sc.next();


            char dxzm = 'A';
            char xxzm = 'a';
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 2; j++) {
                    zm[i][0] = dxzm;
                    zm[i][1] = xxzm;
                }
                dxzm++;
                xxzm++;
            }

            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < 26; j++) {
                    if (str.charAt(i) == zm[j][0] || str.charAt(i) == zm[j][1]) {
                        sum[j] += 1;
                    }
                }
            }
        }
        for(int i = 0;i < 26;i++)
        {
            System.out.println(zm[i][1] + " : " + sum[i]);
        }

    }
}

