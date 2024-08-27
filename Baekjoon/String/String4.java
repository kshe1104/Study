package Baekjoon.String;
import java.util.Scanner;
public class String4 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();
        sr.nextLine();

        char[] word= new char[num];//문자형 배열생성

        int sum = 0; //더할 변수
        String word1 = sr.nextLine(); //입력받을 문자열

        for(int i =0;i<word.length;i++)
        {
            word[i] = word1.charAt(i); //String형을 문자형배열에 저장
            sum+=word[i]-'0'; //문자를 숫자로 변환하여 합산해주어야한다.
        }
        System.out.println(sum);
        sr.close();
    }
}
