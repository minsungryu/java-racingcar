package racingcar;

import racingcar.domain.RacingGame;
import racingcar.view.RacingConsoleView;

public class Main {

    public static void main(String[] args) {
        RacingGame game = new RacingGame();
        game.setView(new RacingConsoleView());
        game.run();
    }

}
