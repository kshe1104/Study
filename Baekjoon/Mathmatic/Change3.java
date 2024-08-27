package Baekjoon.Mathmatic;
import java.util.Scanner;

public class Change3 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int test = sr.nextInt();
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;
        for(int i=0;i<test;i++)
        {
         int change = sr.nextInt();
         quarter = change/25;
         dime = (change%25)/10;
         nickel = ((change%25)%10)/5;
         penny = (((change%25)%10)%5)/1;
            System.out.println(quarter+" "+dime+" "+nickel+" "+penny);
        }
    }
}
