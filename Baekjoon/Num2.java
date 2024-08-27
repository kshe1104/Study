package Baekjoon;
import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int b = sr.nextInt();
        int[] array = new int[a];

        for(int i=0;i< array.length;i++)
        {
            array[i] = sr.nextInt();

        }
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<b)
            {
                System.out.print(array[i]+" ");
            }
        }
    }
}
