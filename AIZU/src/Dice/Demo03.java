/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/11/ITP1_11_D
 */
package Dice;

import java.util.Scanner;

public class Demo03 {
    private int[] mynumber1;
    private int[] mynumber2;

    public void setmynumber1(int[] mynumber1) {
        this.mynumber1 = mynumber1;
    }

    public int[] getmynumber1() {
        return mynumber1;
    }

    public void setMynumber2(int[] mynumber2) {
        this.mynumber2 = mynumber2;
    }

    public int[] getMynumber2() {
        return mynumber2;
    }

    public int[] turnE(int[] number) {
        int tmp[] = new int[6];
        tmp[0] = mynumber1[3];
        tmp[1] = mynumber1[1];
        tmp[2] = mynumber1[0];
        tmp[3] = mynumber1[5];
        tmp[4] = mynumber1[4];
        tmp[5] = mynumber1[2];
        for (int j = 0; j < 6; j++) {
            mynumber1[j] = tmp[j];
        }
        return mynumber1;
    }

    public int[] turnS(int[] number) {
        int tmp[] = new int[6];
        tmp[0] = mynumber1[4];
        tmp[1] = mynumber1[0];
        tmp[2] = mynumber1[2];
        tmp[3] = mynumber1[3];
        tmp[4] = mynumber1[5];
        tmp[5] = mynumber1[1];
        for (int j = 0; j < 6; j++) {
            mynumber1[j] = tmp[j];
        }
        return mynumber1;
    }

    public int[] turnW(int[] number) {
        int tmp[] = new int[6];
        tmp[0] = mynumber1[2];
        tmp[1] = mynumber1[1];
        tmp[2] = mynumber1[5];
        tmp[3] = mynumber1[0];
        tmp[4] = mynumber1[4];
        tmp[5] = mynumber1[3];
        for (int j = 0; j < 6; j++) {
            mynumber1[j] = tmp[j];
        }
        return mynumber1;
    }

    public int[] turnN(int[] number) {
        int tmp[] = new int[6];
        tmp[0] = mynumber1[1];
        tmp[1] = mynumber1[5];
        tmp[2] = mynumber1[2];
        tmp[3] = mynumber1[3];
        tmp[4] = mynumber1[0];
        tmp[5] = mynumber1[4];
        for (int j = 0; j < 6; j++) {
            mynumber1[j] = tmp[j];
        }
        return mynumber1;
}
    public boolean judge(int[] num1,int[] num2)
    {
        boolean result = false;
        while(true)
        {
            setmynumber1(num1);
            setMynumber2(num2);
            int yes = 0;
            turnE(getmynumber1());     //让南面的面朝南
            int n = 0;
            for(int i = 0;i < 6;i++)
            {
                if(mynumber1[i] == mynumber2[i])
                {
                    n++;
                }
            }
            if(n == 6)
            {
                result = true;
                yes = 1;
                return result;
            }
            else {
                for (int i = 0; i < 3; i++) {
                    turnE(getmynumber1());
                    int m = 0;
                    for (int j = 0; j < 6; j++) {
                        if (mynumber1[j] == mynumber2[j]) {
                            m++;
                        }
                        //              System.out.print(mynumber1[j] + " ");
                    }
                    //          System.out.println();
                    if (m == 6) {
                        result = true;
                        yes = 1;
                        return result;
                    }
                }
            }
            turnS(getmynumber1());     //让上边的面朝南
            int n1 = 0;
            for(int i = 0;i < 6;i++)
            {
                if(mynumber1[i] == mynumber2[i])
                {
                    n1++;
                }
            }
            if(n1 == 6)
            {
                result = true;
                yes = 1;
                return result;
            }
            else {
                for (int i = 0; i < 4; i++) {
                    turnE(getmynumber1());
                    int m = 0;
                    for (int j = 0; j < 6; j++) {
                        if (mynumber1[j] == mynumber2[j]) {
                            m++;
                        }
                        //             System.out.print(mynumber1[j] + " ");
                    }
                    //         System.out.println();
                    if (m == 6) {
                        result = true;
                        yes = 1;
                        return result;
                    }
                }
                turnN(getmynumber1());
            }
            turnW(getmynumber1());     //让东面的面朝南
            turnS(getmynumber1());
            int n2 = 0;
            for(int i = 0;i < 6;i++)
            {
                if(mynumber1[i] == mynumber2[i])
                {
                    n2++;
                }
            }
            if(n2 == 6)
            {
                result = true;
                yes = 1;
                return result;
            }
            else {
                for (int i = 0; i < 4; i++) {
                    turnE(getmynumber1());
                    int m = 0;
                    for (int j = 0; j < 6; j++) {
                        if (mynumber1[j] == mynumber2[j]) {
                            m++;
                        }
                        //               System.out.print(mynumber1[j] + " ");
                    }
                    //         System.out.println();
                    if (m == 6) {
                        result = true;
                        yes = 1;
                        return result;
                    }
                }
                turnN(getmynumber1());
                turnE(getmynumber1());
            }
            turnE(getmynumber1());     //让西面的面朝南
            turnS(getmynumber1());
            int n4 = 0;
            for(int i = 0;i < 6;i++)
            {
                if(mynumber1[i] == mynumber2[i])
                {
                    n4++;
                }
            }
            if(n4 == 6)
            {
                result = true;
                yes = 1;
                return result;
            }
            else {
                for (int i = 0; i < 4; i++) {
                    turnE(getmynumber1());
                    int m = 0;
                    for (int j = 0; j < 6; j++) {
                        if (mynumber1[j] == mynumber2[j]) {
                            m++;
                        }
                        //           System.out.print(mynumber1[j] + " ");
                    }
                    //         System.out.println();
                    if (m == 6) {
                        result = true;
                        yes = 1;
                        return result;
                    }
                }
                turnN(getmynumber1());
                turnW(getmynumber1());
            }
            turnS(getmynumber1());     //让北面的面朝南
            turnS(getmynumber1());
            int n5 = 0;
            for(int i = 0;i < 6;i++)
            {
                if(mynumber1[i] == mynumber2[i])
                {
                    n5++;
                }
            }
            if(n5 == 6)
            {
                result = true;
                yes = 1;
                return result;
            }
            else {
                for (int i = 0; i < 4; i++) {
                    turnE(getmynumber1());
                    int m = 0;
                    for (int j = 0; j < 6; j++) {
                        if (mynumber1[j] == mynumber2[j]) {
                            m++;
                        }
                        //         System.out.print(mynumber1[j] + " ");
                    }
                    //      System.out.println();
                    if (m == 6) {
                        result = true;
                        yes = 1;
                        return result;
                    }
                }
                turnN(getmynumber1());
                turnN(getmynumber1());
            }
            turnN(getmynumber1());     //让下边的面朝南
            int n3 = 0;
            for(int i = 0;i < 6;i++)
            {
                if(mynumber1[i] == mynumber2[i])
                {
                    n3++;
                }
            }
            if(n3 == 6)
            {
                result = true;
                yes = 1;
                return result;
            }
            else {
                for (int i = 0; i < 4; i++) {
                    turnE(getmynumber1());
                    int m = 0;
                    for (int j = 0; j < 6; j++) {
                        if (mynumber1[j] == mynumber2[j]) {
                            m++;
                        }
                        //         System.out.print(mynumber1[j] + " ");
                    }
                    //      System.out.println();
                    if (m == 6) {
                        result = true;
                        yes = 1;
                        return result;
                    }
                }
            }
            if(yes == 0) {
                result = false;
                return result;
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Demo03 dice1 = new Demo03();
        int[][] number = new int[n][6];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                number[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                dice1.setmynumber1(number[i]);
                dice1.setMynumber2(number[j]);
                if(dice1.judge(dice1.mynumber1, dice1.mynumber2))
                {
                    System.out.println("No");
                    return;
                }
            }

        }
        System.out.println("Yes");

    }
}

