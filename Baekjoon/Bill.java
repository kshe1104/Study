package Baekjoon;
import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
       Scanner sr = new Scanner(System.in);
        int sum = sr.nextInt(); //예산 변수 입력
        int i = sr.nextInt(); //갯수 입력
        int price[] = new int[i]; //가격 입력받을 배열
        int quantity[] = new int[i]; //갯수 입력받을 배열
        int total=0; //실제 총 가격

        for(int j=0;j<i;j++)
        {
            price[j]= sr.nextInt();
            quantity[j]= sr.nextInt();

            total += (price[j]*quantity[j]);
        }
        if(total==sum)
        {
            System.out.println("NO");
        }
        else{
            System.out.println("Yes");
        }
    }
}
