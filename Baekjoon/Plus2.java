package Baekjoon;
import java.util.Scanner;

public class Plus2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt(); //입력받을 수
        int sum = 0;//합을 저장할 변수
       for(int i=n;i>0;i--)
       {
           sum+=i;
       }
        System.out.println(sum);
    }
}
