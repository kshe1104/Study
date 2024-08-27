package Baekjoon.Mathmatic;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        String num = sr.next();
        int num2 = sr.nextInt();
        char word[] = num.toCharArray();
        int sum=0;

        for(int i=0;i<num.length();i++)
        {
            if(word[i]>='A'&&word[i]<='Z')
        {
            word[i]-=55;

        }
            else if(word[i]>='0'&&word[i]<='9'){
                word[i] -= '0'; //실제로는 char였지만 -'0'을 하는 과정에서 실제 숫자값이 된다.

            }
            sum += (int) word[i] *Math.pow(num2,num.length()-i-1);

        }

        System.out.println(sum);

    }
}
