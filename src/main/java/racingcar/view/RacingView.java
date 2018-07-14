package racingcar.view;

import racingcar.domain.Car;

import java.util.List;

public interface RacingView {

    List<Car> getRacingCars();

    int getGameTimes();

    void print(Object message);

    void println(Object message);

}
