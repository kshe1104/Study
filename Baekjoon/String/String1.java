package Baekjoon.String;
import java.util.ArrayList;
import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String word = sr.nextLine(); //문자열 입력받기
        int num = sr.nextInt(); //문자의 서수

        char result[] = word.toCharArray();
        System.out.println();
        ArrayList<Integer> myArrayList = new ArrayList<>(); //배열 리스트

        String str = "hello";
        String reverse = new StringBuffer(str).reverse().toString();
    }
}
