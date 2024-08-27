package Baekjoon;
import java.util.Scanner;
public class Chess {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[] chess = new int[6];
        for(int i=0;i< chess.length;i++)
        {
            chess[i] = sr.nextInt();
        }
        int[] result = new int[6];
        result[0]=1;
        result[1]=1;
        result[2]=2;
        result[3]=2;
        result[4]=2;
        result[5]=8;
        for(int i=0;i< result.length;i++)

        {
            result[i]=result[i]-chess[i];
        }
        for(int i=0;i< result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
