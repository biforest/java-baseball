package baseball;

import baseball.generator.RandomNumberGenerator;
import baseball.receiver.ConsoleInputReceiver;
import baseball.receiver.InputReceiver;
import baseball.number.GameNumber;
import baseball.printer.ConsolePrinter;
import baseball.printer.Printer;
import baseball.result.Result;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameManager {
    private final int START_GAME = 1;

    private final Printer printer;
    private final InputReceiver receiver;
    private GameNumber seedNumber;
    private GameNumber userNumber;

    public GameManager(Scanner scanner) {
        if(scanner == null) {
            throw new NullPointerException();
        }

        printer = new ConsolePrinter();
        receiver = new ConsoleInputReceiver(scanner);
    }

    public void run() {
        printer.greet();
        printer.askStartGame();

        boolean continueGame = isContinueGame();

        while (continueGame) {
            Result result = new Result();
            seedNumber = RandomNumberGenerator.generate();
            startGame(result);
            printer.noticeWin();
            printer.askStartGame();
            continueGame = isContinueGame();
        }
    }

    private boolean isContinueGame() {
        int select = receiver.receiveContinueGameSelect();
        try {
            throwIfInputIsNotOneOrTwo(select);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return isContinueGame();
        }
        return (select == START_GAME);
    }

    private void throwIfInputIsNotOneOrTwo(int select) {
        if (select != 1 && select != 2) {
            throw new IllegalArgumentException("올바르지 않은 입력입니다.\n시작은 1, 종료는 2 입니다.");
        }
    }

    private void startGame(Result result) {
        while (!result.isThreeStrike()) {
            boolean isValidInput = receiveUserInput();

            if (!isValidInput) {
                continue;
            }
            seedNumber.compare(userNumber, result);
            printer.printResult(result);
        }
    }

    private boolean receiveUserInput() {
        try {
            printer.requestUserNumber();
            userNumber = receiver.receiveUserNumber();
        } catch (IllegalArgumentException | InputMismatchException e) {
            receiver.dealWithExceptionalInput();
            printer.warnInvalidInput();
            return false;
        }
        return true;
    }
}
