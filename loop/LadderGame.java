package loop;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LadderGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 참가자 수와 결과 입력 받기
        System.out.print("참가자 수를 입력하세요: ");
        int numParticipants = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        List<String> participants = new ArrayList<>();
        for (int i = 0; i < numParticipants; i++) {
            System.out.print("참가자 " + (i + 1) + "의 이름을 입력하세요: ");
            participants.add(scanner.nextLine());
        }

        List<String> results = new ArrayList<>();
        for (int i = 0; i < numParticipants; i++) {
            System.out.print("결과 " + (i + 1) + "를 입력하세요: ");
            results.add(scanner.nextLine());
        }

        // 사다리 배열 생성
        char[][] ladder = createLadder(numParticipants, 10); // 10은 사다리의 높이 (단계 수)

        // 사다리 출력
        System.out.println("\n사다리:");
        printLadder(ladder, participants, results);

        // 사다리 게임 실행
        for (int i = 0; i < numParticipants; i++) {
            String participant = participants.get(i);
            int resultIndex = playLadder(ladder, i);
            System.out.println(participant + "의 결과는: " + results.get(resultIndex));
        }

        scanner.close();
    }

    // 사다리 생성
    private static char[][] createLadder(int numParticipants, int height) {
        char[][] ladder = new char[height][numParticipants - 1];
        Random random = new Random();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < numParticipants - 1; j++) {
                ladder[i][j] = (random.nextBoolean()) ? '-' : ' ';
            }
        }

        return ladder;
    }

    // 사다리 출력
    private static void printLadder(char[][] ladder, List<String> participants, List<String> results) {
        int numParticipants = participants.size();
        int height = ladder.length;

        for (String participant : participants) {
            System.out.print(participant + "\t");
        }
        System.out.println();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < numParticipants - 1; j++) {
                System.out.print("|" + ladder[i][j] + "\t");
            }
            System.out.println("|");
        }

        for (String result : results) {
            System.out.print(result + "\t");
        }
        System.out.println();
    }

    // 사다리 타기 실행
    private static int playLadder(char[][] ladder, int startPosition) {
        int position = startPosition;

        for (char[] chars : ladder) {
            if (position > 0 && chars[position - 1] == '-') {
                position--;
            } else if (position < chars.length && chars[position] == '-') {
                position++;
            }
        }

        return position;
    }
}
