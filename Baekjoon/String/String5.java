package Baekjoon.String;
import java.util.Scanner;
public class String5 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String word = sr.nextLine(); //단어 입력받기

        int[] result = new int[26]; //알파벳 갯수만큼 배열을 -1로 초기화
        for(int i=0;i<result.length;i++)
        {
            result[i]=-1;
        }

        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);// 단어의 알파벳하나하나를 저장할 변수
            int index = ch-'a';//??
            if(result[index]==-1){
                result[index]=i; //처음 등장했을 때의 해당위치를 저장함
            }
        }

        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
