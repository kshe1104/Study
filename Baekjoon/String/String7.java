package Baekjoon.String;
import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
       String phrase = sr.nextLine().trim(); //trim이 공백을 제거 해주는 메소드
       if(phrase.isEmpty())
       {
           System.out.println(0);
       }
       else{
           String[] words = phrase.split("\\s+"); //문자열 배열로만든다.
           System.out.println(words.length);
       }
    sr.close();
    }

}
