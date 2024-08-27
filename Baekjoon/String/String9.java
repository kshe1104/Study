package Baekjoon.String;
import java.util.Scanner;
public class String9 {
    public static void main(String[] args) { //힌트 아스키코드
        Scanner sr = new Scanner(System.in);
        String word = sr.nextLine(); //문자입력
        int[] num = new int[26]; //알파벳의 배열로 해당 알파벳이 등장할 때마다 증가시켜줌 ->0으로 자동초기화

        for(int i =0;i<word.length();i++)
        {
            if(65<=word.charAt(i)&&word.charAt(i)<=90) //대문자범위
            {
                num[word.charAt(i)-65]++;
//                num[word.charAt(i)-'a']++;
            }
            else{ //소문자범위
                num[word.charAt(i)-97]++;
//                num[word.charAt(i)-'A']++;
            }
        }
        int max = -1;
        char ch = '?';
        for(int i=0;i<26;i++)
        {
            if(num[i]>max)
            {
                max = num[i];
                ch = (char)(i+65); //대문자로치환
            }
            else if(num[i]==max)
            {
             ch = '?';
            }
        }
        System.out.println(ch);
    }

}
