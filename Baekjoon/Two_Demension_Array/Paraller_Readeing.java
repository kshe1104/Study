package Baekjoon.Two_Demension_Array;
import java.util.Scanner;

public class Paraller_Readeing {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String word[] = new String[5];
        char arr[][] = new char[5][]; //이렇게 설정하면 예외 오류가 발생할 수 있음

        for(int i=0;i<word.length;i++) //5개의 단어를 입력받을 Str형 배열
        {
            word[i]=sr.nextLine();
        }

        for(int i =0;i<word.length;i++) //5개의 단어를 각각 char형 2차원 배열에 집어넣음
        {
            arr[i] = word[i].toCharArray(); //크기를 모를 배열을 생성한다.
        }

        int maxLength = 0; //최대길이 계산
        for(int i=0;i<word.length;i++)
        {
            if(word[i].length()>maxLength)
            {
                maxLength = word[i].length();
            }
        }

        for(int j=0;j<maxLength;j++)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(j<arr[i].length){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
