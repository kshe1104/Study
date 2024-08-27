package Baekjoon;
import java.util.Scanner;
public class Num3 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a=sr.nextInt();
        int array[] = new int[a];


        for(int i =0;i< array.length;i++)
        {
            array[i]=sr.nextInt();

        }
        int min = array[0];
        int max = array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min = array[i];
            }
            if(array[i]>max)
            {
                max = array[i];
            }
        }
        System.out.println(min+" "+max);

    }
}
