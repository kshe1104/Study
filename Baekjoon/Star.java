package Baekjoon;
import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();

        for(int i=0;i<2*num-1;i++) //세로줄 총 10개를찍어야함
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            for(int j=9;j>i;j--)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
