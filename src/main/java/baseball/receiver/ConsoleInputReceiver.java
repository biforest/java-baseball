package baseball.receiver;

import baseball.number.GameNumber;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class ConsoleInputReceiver implements InputReceiver {
    private final int START_GAME = 1;

    private final Scanner scanner;

    public ConsoleInputReceiver(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public boolean checkContinueGame() {
        int select = 0;

        try {
            select = scanner.nextInt();
            throwIfInputIsNotOneOrTwo(select);
        } catch (IllegalArgumentException exception) {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            return checkContinueGame();
        } catch (InputMismatchException e) {
            cleanScannerBuffer();
            System.out.println("잘못된 입력입니다. 숫자만 입력해주세요.");
            return checkContinueGame();
        }

        return select == START_GAME;
    }

    @Override
    public void receiveUserNumber(GameNumber userNumber) throws  IllegalArgumentException, InputMismatchException {
        if (userNumber == null) {
            throw new NullPointerException();
        }

        int number = scanner.nextInt();
        if (!GameNumber.validateNumber(number)) {
            throw new IllegalArgumentException();
        }
        userNumber.setValue(Integer.toString(number));
    }

    @Override
    public void dealWithExceptionalInput() {
        cleanScannerBuffer();
    }

    private void cleanScannerBuffer() {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    private void throwIfInputIsNotOneOrTwo(int select) {
        if(select != 1 && select != 2) {
            throw new IllegalArgumentException();
        }
    }
}
