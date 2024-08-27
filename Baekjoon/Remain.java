package Baekjoon;
import java.util.Scanner;
import java.util.HashSet;

public class Remain {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[] num = new int[10]; //10개 배열생성 -> 입력받을것

        for (int i = 0; i < num.length; i++) {
            num[i] = sr.nextInt(); //10개의 숫자 입력받기
        }

        HashSet<Integer> remainset = new HashSet<>();

        for (int i=0;i<num.length; i++)
        {
            remainset.add(num[i]%42);
        }
        System.out.println(remainset.size());
    }
}
