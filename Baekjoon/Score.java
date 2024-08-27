package Baekjoon;
import java.util.Scanner;
public class Score {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int subject = sr.nextInt(); //과목갯수
        int score[] = new int[subject];

        double sum=0;
        for(int i=0;i<score.length;i++) {
            score[i] = sr.nextInt();
        }
        int max = 0;
        for(int j=0;j<score.length;j++)
        {
            if (score[j]>max)
            {
            max = score[j]; //최고값 선정
                 }
        }
        for(int k =0;k<score.length;k++)
        {
            sum+=(double)score[k]/max*100;
        }
        double average = sum/subject;
        System.out.println(average);

    }
}
