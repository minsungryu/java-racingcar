package racingcar.domain;

import racingcar.util.Util;
import racingcar.view.RacingView;

import java.util.List;

public class RacingGame {

    private RacingView view;

    private List<Car> cars;
    private int times;
    private int maxPosition;

    public void run() {
        initGame();
        while (0 < times--) {
            maxPosition = moveCars();
        }
        printGameResult();
    }

    private void initGame() {
        cars = view.getRacingCars();
        times = view.getGameTimes();
        maxPosition = 0;
    }

    public int moveCars() {
        return cars.stream()
                .mapToInt(car -> car.moveByCondition(Util.randomCondition()))
                .max().orElse(maxPosition);
    }

    private void printGameResult() {
        view.println("실행결과");
        cars.stream().forEach(view::println);
    }

    public void setView(RacingView view) {
        this.view = view;
    }

}
