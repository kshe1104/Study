package Baekjoon;
import java.util.Scanner;

public class Num5 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        String sNum = sr.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(int i=0;i<cNum.length;i++)
        {
            sum+=cNum[i]-'0';
        }
        System.out.println(sum);
    }
}
