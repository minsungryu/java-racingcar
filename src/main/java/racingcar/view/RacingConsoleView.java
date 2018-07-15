package racingcar.view;

import racingcar.domain.Car;
import wrapper.NameString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

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
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return NameString.ofRaw(read()).stream().map(Car::new).collect(Collectors.toList());
    }

    @Override
    public int getGameTimes() {
        println("시도할 회수는 몇 회 인가요?");
        return Integer.parseInt(read());
    }

    @Override
    public void print(Object message) {
        System.out.print(message);
    }

    @Override
    public void println() {
        System.out.println();
    }

    @Override
    public void println(Object message) {
        System.out.println(message);
    }

}
