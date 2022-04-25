/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/11/ITP1_11_A
 */
package Dice;
import java.util.Scanner;

public class Demo01 {
    private int[] mynumber;
    private char[] mydirection;

    public void setMynumber(int[] mynumber) {
        this.mynumber = mynumber;
    }

    public int[] getMynumber() {
        return mynumber;
    }

    public void setMydirection(char[] mydirection) {
        this.mydirection = mydirection;
    }

    public char[] getMydirection() {
        return mydirection;
    }

    public int Dice(int[] num, char[] direction) {
        mynumber = num;
        mydirection = direction;
        for (int i = 0; i < mydirection.length; i++) {
            int[] tmp = new int[6];
            switch (mydirection[i]) {
                case 'E': {
                    tmp[0] = mynumber[3];
                    tmp[1] = mynumber[1];
                    tmp[2] = mynumber[0];
                    tmp[3] = mynumber[5];
                    tmp[4] = mynumber[4];
                    tmp[5] = mynumber[2];
                    break;
                }
                case 'S': {
                    tmp[0] = mynumber[4];
                    tmp[1] = mynumber[0];
                    tmp[2] = mynumber[2];
                    tmp[3] = mynumber[3];
                    tmp[4] = mynumber[5];
                    tmp[5] = mynumber[1];
                    break;
                }
                case 'W': {
                    tmp[0] = mynumber[2];
                    tmp[1] = mynumber[1];
                    tmp[2] = mynumber[5];
                    tmp[3] = mynumber[0];
                    tmp[4] = mynumber[4];
                    tmp[5] = mynumber[3];
                    break;
                }
                case 'N': {
                    tmp[0] = mynumber[1];
                    tmp[1] = mynumber[5];
                    tmp[2] = mynumber[2];
                    tmp[3] = mynumber[3];
                    tmp[4] = mynumber[0];
                    tmp[5] = mynumber[4];
                    break;
                }
            }
            for (int j = 0; j < 6; j++) {
                mynumber[j] = tmp[j];
            }
        }
        return mynumber[0];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo01 dice = new Demo01();
        int[] num = new int[6];
        for (int i = 0; i < 6; i++) {
            num[i] = sc.nextInt();
        }
        dice.setMynumber(num);
        dice.setMydirection(sc.next().toCharArray());
        System.out.println(dice.Dice(dice.getMynumber(), dice.getMydirection()));
    }

}