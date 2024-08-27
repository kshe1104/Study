package Baekjoon.Two_Demension_Array;
import java.util.*;

public class Paper {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();
        int N = 100;
        int totalArea = 0;
        boolean[][] paper = new boolean[100][100];
        for(int i=0;i<num;i++) //색종이 크기 받기
        {
            int x = sr.nextInt(); //x좌표와 y좌표 입력받기
            int y = sr.nextInt();

            for (int j = x; j < x+10; j++) { //이중 반복문
                for (int k = y; k < y + 10; k++) {
                    if(!paper[j][k])
                    {
                        paper[j][k] = true;
                        totalArea++;
                    }
                }
            }
        }
    }
}
