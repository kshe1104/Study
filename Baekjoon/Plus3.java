package Baekjoon;
import java.io.*;

public class Plus3 {
    public static void main(String[] args)
    throws IOException //예외처리 ->bufferedreader를 사용할때 무조건 사용
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); //테스트 케이스의 갯수 T를 입력받는다

        for(int i = 0;i<T;i++) //T번 반복해서 진행함
        {
            String[] input = br.readLine().split("");//띄어쓰기를 기준으로 input이라는 이름의 String형 배열을 만든다 한번만띄어쓰면 한개일듯
            int a = Integer.parseInt(input[0]);//받은걸 입력함
            int b = Integer.parseInt(input[1]);//받은걸 입력함
            int sum = a+b; //더함
            bw.write(sum+"\n");//출력
        }

        bw.flush(); //bufferWriter.flush
        bw.close();
        br.close();

    }
}
