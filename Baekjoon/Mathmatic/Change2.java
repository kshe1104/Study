package Baekjoon.Mathmatic;
import java.util.Scanner;
public class Change2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int num1 = sr.nextInt(); //10진수 숫자를 입력받음
        int num2 = sr.nextInt(); //진수

        int sum = 0;//10진법을 받을 숫자
        StringBuilder sb = new StringBuilder();
        int val = 0;

        while (val>0) {
            val = num1%num2; //나머지를 받는다 ->나머지를 이어붙혀야한다.
            if(val<10){
                sb.append(val);
            }
            else{
                sb.append((char) (val + 'A' - 10));
            }
            num1/=num2;

        }
        System.out.println(sb.reverse());

    }
}
