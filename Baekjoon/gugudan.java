package Baekjoon;
import java.util.Scanner;


public class gugudan {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num1 = sr.nextInt();
        for(int i =1;i<10;i++)
        {
            System.out.println(num1+" * "+i+" = "+num1*i);
        }

    }
}
