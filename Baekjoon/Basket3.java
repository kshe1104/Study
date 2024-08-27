package Baekjoon;
import java.util.Scanner;
public class Basket3 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();
        int tries = sr.nextInt();
        int basket[] = new int[num+1];

        for(int i=0;i<basket.length;i++)
        {
            basket[i]=i; //해당 번호 넣기
        }
        for(int j=0;j<tries;j++)
        {
            int a = sr.nextInt();
            int b = sr.nextInt();
            reverse(basket,a,b);
        }
        for(int k=1;k<num+1;k++)
        {
            System.out.print(basket[k]+" ");
        }
    }
public static void reverse(int[] array,int start,int end)
{
    while(start<end)
    {
        int temp = array[start];
        array[start] = array[end];
        array[end]=temp;
        start++;
        end--;
    }
}
}
