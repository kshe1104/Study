package Baekjoon.Mathmatic;
import java.util.Scanner;
public class Point {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int tries = sr.nextInt(); //시도횟수
        int result = 0; //결과를 받을 변수
        int num2 = 2;
        for(int i =1;i<tries+1;i++)
        {
            int num1 = (int) Math.pow(2,i-1);
            num2 +=num1;
            result = num2*num2;
        }
        System.out.println(result);

    }
}
