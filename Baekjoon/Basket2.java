package Baekjoon;
import java.util.Scanner;

public class Basket2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();
        int tries = sr.nextInt();
        int basket[] = new int[num+1];//

        for(int i=0;i<basket.length;i++)
        {
         basket[i]=i; //해당 번호 넣기
        }
        for(int j=0;j<tries;j++)
        {
        int a = sr.nextInt();
        int b = sr.nextInt();
            int per = basket[b]; //b번 바구니값저장
            basket[b]=basket[a]; //b에다가 a값 넣기
            basket[a]=per; //a에 b원래값 넣기
        }
        for(int k=1;k<num+1;k++)
        {
            System.out.print(basket[k]+" ");
        }

    }
}
