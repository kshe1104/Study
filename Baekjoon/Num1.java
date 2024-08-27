package Baekjoon;
import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int a= sr.nextInt();
        int[] input = new int[a];
        int count = 0;

        for(int i = 0;i<input.length;i++)
        {
            input[i]=sr.nextInt();
        }
        int find = sr.nextInt();
        for(int i = 0;i< input.length;i++)
        {
            if (find == input[i]) {
                count++;
            }
        }
        System.out.println(count);
    }

}
