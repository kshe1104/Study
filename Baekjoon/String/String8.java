package Baekjoon.String;
import java.util.Scanner;
public class String8 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int []arr = new int[26];
        String word = sr.nextLine();
        boolean check = true;

        for(int i=0;i<word.charAt(word.length())/2;i++) //절반만큼만확인하면됨
        {
            if(word.charAt(i)!=word.charAt(word.length()-i-1))
            {
                check = false;
                break;

            }//첫번째와 마지막 두번째와 마지막-1비교

        }
        if(check)
        {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }


        }

    }
