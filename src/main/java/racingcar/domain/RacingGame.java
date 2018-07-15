package racingcar.domain;

import racingcar.view.RacingView;

public class RacingGame {

    private RacingCars racingCars;
    private RacingView view;

    public void run() {
        initGame();
        racingCars.moveCars(view.getGameTimes());
        printGameResult();
    }

    private void initGame() {
        racingCars = new RacingCars();
        racingCars.setCars(view.getRacingCars());
    }

    private void printGameResult() {
        printCarsPosition();
        printGameWinners();
    }

    private void printGameWinners() {
        view.println();
        view.print(String.format("%s가 최종 우승했습니다.", racingCars.getWinnerNames()));
    }

    private void printCarsPosition() {
        view.println();
        view.println("실행결과");
        racingCars.getGameResult().stream().forEach(view::println);
    }

    public void setView(RacingView view) {
        this.view = view;
    }

}
