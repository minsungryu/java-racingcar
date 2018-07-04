package race;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private static final String CAR_TILE = "-";

    private Scanner scanner = new Scanner(System.in);

    public String[] inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = scanner.nextLine();
        return parseCarNames(carNames);
    }

    String[] parseCarNames(String carNames) {
        if (carNames == null || carNames.equals("")) {
            throw new IllegalArgumentException();
        }

        String[] carNamesArray = carNames.split(",");

        for (int i = 0; i < carNamesArray.length; i++) {
            carNamesArray[i] = carNamesArray[i].trim();
        }
        return carNamesArray;
    }

    public int inputTime() {
        System.out.println("시도할 횟수는 몇 회 인가요?");
        return scanner.nextInt();
    }

    static String generateCarTiles(int carPosition) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < carPosition; i++) {
            sb.append(CAR_TILE);
        }

        return sb.toString();
    }

    public void showResult(RacingResult racingResult) {
        System.out.println("실행 결과\n");

        racingResult.getResultMap().forEach((name, position) -> {
            System.out.println(name + " : " + generateCarTiles(position));
        });

        System.out.println(generateWinners(racingResult.getWinners()));
    }

    String generateWinners(List<String> winners) {
        StringBuilder sb = new StringBuilder();
        for (String name : winners) {
            sb.append(name).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("가 최종 우승했습니다.");
        return sb.toString();
    }
}
