package Baekjoon;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int student[] = new int[31]; //학생 30명 배열 생성
        int fin;

        for(int i =0;i<28;i++) //각 배열에 맞는 숫자 입력
        {
             fin = sr.nextInt();
             student[fin]=1;
        }
        for(int i=1;i<student.length;i++)
        {
          if(student[i]!=1)
          {
              System.out.println(i);
          }

        }

            }
        }


