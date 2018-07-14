package racingcar.view;

import racingcar.domain.Car;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class RacingConsoleView implements RacingView {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String read() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public List<Car> getRacingCars() {
        println("자동차 대수는 몇 대 인가요?");
        int numberOfCars = Integer.parseInt(read());
        List<Car> cars = new ArrayList<>(numberOfCars);
        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car());
        }
        return cars;
    }

    @Override
    public int getGameTimes() {
        println("시도할 회수는 몇 회 인가요?");
        return Integer.parseInt(read());
    }

    @Override
    public void print(Object message) {
        Optional.ofNullable(message).ifPresent(System.out::print);
    }

    @Override
    public void println(Object message) {
        Optional.ofNullable(message).ifPresent(System.out::println);
    }

}
