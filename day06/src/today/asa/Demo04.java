/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/8/ITP1_8_D
 */
package today.asa;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        String strL = sc.next();
        String strS = sc.next();
        String ring = strL + strL;
        int sum2 = 0;
        for(int i = 0;i < ring.length() - strS.length();i++) {
            int sum = 0;
            for (int k = 0; k < strS.length(); k++) {

                    if (ring.charAt(k + i) == strS.charAt(k)) {
                        sum += 1;
                    }

            }
            sum2 = sum;
            if (sum == strS.length()) {
                System.out.println("Yes");
                break;
            }

        }
             if(sum2 != strS.length())
            {
                System.out.println("No");
            }

    }
}