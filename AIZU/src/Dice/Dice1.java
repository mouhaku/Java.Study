package Dice;

public class Dice1 {
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

    public int Dice(int[] num, char[] direction)
    {
        mynumber = num;
        mydirection = direction;
        for(int i = 0;i < mydirection.length;i++)
        {
            int[] tmp = new int[6];
            switch(mydirection[i])
            {
                case 'E' :
                {
                    tmp[0] = mynumber[3];
                    tmp[1] = mynumber[1];
                    tmp[2] = mynumber[0];
                    tmp[3] = mynumber[5];
                    tmp[4] = mynumber[4];
                    tmp[5] = mynumber[2];
                    break;
                }
                case 'S' :
                {
                    tmp[0] = mynumber[4];
                    tmp[1] = mynumber[0];
                    tmp[2] = mynumber[2];
                    tmp[3] = mynumber[3];
                    tmp[4] = mynumber[5];
                    tmp[5] = mynumber[1];
                    break;
                }
                case 'W' :
                {
                    tmp[0] = mynumber[2];
                    tmp[1] = mynumber[1];
                    tmp[2] = mynumber[5];
                    tmp[3] = mynumber[0];
                    tmp[4] = mynumber[4];
                    tmp[5] = mynumber[3];
                    break;
                }
                case 'N' :
                {
                    tmp[0] = mynumber[1];
                    tmp[1] = mynumber[5];
                    tmp[2] = mynumber[2];
                    tmp[3] = mynumber[3];
                    tmp[4] = mynumber[0];
                    tmp[5] = mynumber[4];
                    break;
                }
            }
            for(int j = 0;j < 6;j++)
        {
            mynumber[j] = tmp[j];
        }
        }
        return mynumber[0];
    }
}
