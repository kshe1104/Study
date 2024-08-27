package Baekjoon.Mathmatic;
import java.util.Scanner;

public class Honeycomb {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num1 = sr.nextInt();
        int range = 2;
        int count = 1;
        if(num1==1)
        {
            System.out.println(1);
        }
       else {
            while (range<=num1) {
                range+=(6*count);
                count++;
            }
            System.out.println(count);
        }

    }
}
