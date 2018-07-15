package racingcar.domain;

import racingcar.util.Util;

import java.util.List;
import java.util.stream.Collectors;

public class RacingCars {

    private List<Car> cars;
    private int maxPosition;

    public void moveCars(int times) {
        maxPosition = 0;
        for (int i = 0; i < times; i++) {
            maxPosition = getMaxPositionAfterMoveCars();
        }
    }

    public int getMaxPositionAfterMoveCars() {
        return cars.stream()
                .mapToInt(car -> car.moveByCondition(Util.randomCondition()))
                .max().orElse(maxPosition);
    }

    public List<String> getGameResult() {
        return cars.stream().map(Car::toString).collect(Collectors.toList());
    }

    public String getWinnerNames() {
        String[] winnerNames = cars.stream()
                .filter(car -> car.isSamePosition(maxPosition))
                .map(Car::getName)
                .toArray(String[]::new);

        return String.join(", ", winnerNames);
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void setMaxPosition(int maxPosition) {
        this.maxPosition = maxPosition;
    }

}
