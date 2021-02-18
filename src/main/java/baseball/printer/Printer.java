package baseball.printer;

import baseball.result.Result;

public interface Printer {
    void greet();

    void askStartGame();

    void requestUserNumber();

    void printResult(Result result);
}
