package Baekjoon.String;
import java.util.Scanner;
public class String3 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int test = sr.nextInt();
        sr.nextLine();
        String word[] = new String[test];
        for (int i = 0; i < word.length; i++){
            word[i]=sr.nextLine();
        }

        for(int i=0;i< word.length;i++)
        {
//            char[] state = word[i].toCharArray();
            System.out.println(word[i].charAt(0)+""+word[i].charAt(word[i].length()-1));
        } // 더하기 연산에서 아스키코드로 서로 더해지기 때문에 중간에 띄어주기 필수
    }
}
