package loop;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

    class Participant { //해당클래스에 참가자의 이름과 가중치를 저장
        String name; //이름
        int weight;//가중치변수

        Participant(String name, int weight) { //생성자
            this.name = name; // 여기서 입력한 이름이 class의 이름이 됨
            this.weight = weight; //여기서 입력한 가중치가 클래스의 가중치가됨
        }
    }

    public class Gatcha {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            List<Participant> participants = new ArrayList<>();

            System.out.println("제비뽑기 프로그램에 오신 것을 환영합니다!");

            // 참가자 입력 받기
            System.out.println("참가자 이름과 가중치를 입력하세요 (입력을 종료하려면 '끝'을 입력하세요):");
            while (true) {
                System.out.print("참가자 이름: ");
                String name = scanner.nextLine();
                if (name.equals("끝")) {
                    break;
                }
                System.out.print("가중치 (1 이상의 정수): ");
                int weight = scanner.nextInt();
                scanner.nextLine();  // 남은 개행 문자 제거
                participants.add(new Participant(name, weight));
            }

            // 참가자가 있는지 확인
            if (participants.isEmpty()) {
                System.out.println("참가자가 없습니다. 프로그램을 종료합니다.");
            } else {
                // 가중치를 기반으로 한 무작위 선택
                String winner = weightedRandomSelection(participants);
                System.out.println("축하합니다! 당첨자는 " + winner + "입니다!");
            }

            scanner.close();
        }

        // 가중치에 따라 무작위로 한 명 선택하는 메서드
        private static String weightedRandomSelection(List<Participant> participants) {
            int totalWeight = 0;
            for (Participant p : participants) {
                totalWeight += p.weight;
            }

            Random random = new Random();
            int randomValue = random.nextInt(totalWeight);

            int cumulativeWeight = 0;
            for (Participant p : participants) {
                cumulativeWeight += p.weight;
                if (randomValue < cumulativeWeight) {
                    return p.name;
                }
            }

            // 이 위치에 도달하지 않지만, 문법적으로 필요함
            return null;
        }
    }

