package Baekjoon.String;
import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int test = sr.nextInt(); //테스트 케이스 수 받기
        sr.nextLine();
        for(int i=0;i<test;i++)
        {
            String word = sr.nextLine();
            if(word.length()>0)
            {
                System.out.println(String.valueOf(word.charAt(0))+String.valueOf(word.charAt(word.length()-1)));
            }
        }
    }
}

//nextInt()와 nextLine()을 같이 사용하면 문제가 발생할 수 있다.