package Baekjoon;
import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int i = sr.nextInt(); //배열의 갯수를 설정함
        int num1[] = new int[2]; //받을 두개의 변수
        int sum[] = new int[i]; //합의 갯수를 설정

        for(int j = 0;j<i;j++)
        {
            num1[0] = sr.nextInt();
            num1[1] = sr.nextInt();
            sum[j] = num1[0]+num1[1];

        }
        for(int k=0;k<i;k++)
        {

        System.out.println("Case #"+(k+1)+": "+sum[k]);

        }
    }

}
