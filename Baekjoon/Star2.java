package Baekjoon;
import java.util.Scanner;
public class Star2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num1 = sr.nextInt(); //줄 입력받기
        for(int i=1;i<=num1;i++) //세로줄 만들기
        {
            for(int j=num1;j>i;j--)
            {
                System.out.print(" ");

            }
            for(int k=0;k<i;k++)
        {
            System.out.print("*");
        }
            System.out.println("");
        }
    }
}
