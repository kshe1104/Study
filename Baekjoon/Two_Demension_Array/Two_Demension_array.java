package Baekjoon.Two_Demension_Array;
import java.util.Scanner;
//같은크기의 행렬 두개의 덧셈
public class Two_Demension_array {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int m = sr.nextInt();

        int a[][] =  new int[n][m];
        int b[][] =  new int[n][m];
        int sum[][] = new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j] = sr.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                b[i][j] = sr.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.println(sum[i][j]);
            }
        }

    }
}
