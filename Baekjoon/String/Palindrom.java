package Baekjoon.String;
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String word = sr.nextLine();
        boolean check = true; //boolean

        for(int i=0;i<word.length()/2;i++) //총길이의 반만큼만 비교해보면 되니까
        {
            if(word.charAt(i) != word.charAt(word.length()-i-1)) //
            {
                check = false;
                break;
            }
        }
        if(check)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
        sr.close();
    }
}
