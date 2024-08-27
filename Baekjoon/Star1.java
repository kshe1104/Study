package Baekjoon;
import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num1 = sr.nextInt(); //몇번째 줄인지 입력
        for(int i=0;i<num1;i++) //세로줄 작성하기
        {
            for(int j=0;j<=i;j++)//별갯수
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
