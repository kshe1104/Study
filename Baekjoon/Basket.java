package Baekjoon;
import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();
        int tries = sr.nextInt();
        int basket[] = new int[1+num];
        for(int i=0;i<tries;i++)
        {
            int a=sr.nextInt();
            int b = sr.nextInt();
            int c = sr.nextInt();
            for(int j=a;j<=b;j++)
            {
                basket[j]=c;
            }
        }
        for(int k=1;k<num+1;k++)
        {
            System.out.print(basket[k]+" ");
        }
    }
}
