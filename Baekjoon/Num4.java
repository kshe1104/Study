package Baekjoon;
import java.util.Scanner;
public class Num4 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[] con = new int[9];
        int max = 0;
        int number = 0;
        for(int i=0;i<con.length;i++)
        {
            con[i]= sr.nextInt();

            if(con[i]>max)
            {
                max = con[i];
            }

        }
        for(int i = 0;i< con.length;i++)
        {
            if(con[i]==max)
            {
                number = i;
            }
        }
        System.out.println(max);
        System.out.println(number+1);
    }
}
