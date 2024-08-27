package Baekjoon;

import java.util.Scanner;
public class Dice

{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int reward = 0;
        if(num1==num2 && num2==num3)
        {
           reward = 10000+(num1)*1000;
        }
        else if(num1==num2 || num2==num3 || num1==num3){
            if(num1==num2)
            {
                reward = 1000+(num1)*100;
            }
            else if (num2==num3)
            {
                reward=1000+(num2)*100;
            }
            else if (num1==num3)
            {
                reward = 1000+(num1)*100;
            }
        }
        else{
            int max = Math.max(num1,Math.max(num2,num3));
            reward = max *100;
        }

        System.out.println(reward);


    }
}
