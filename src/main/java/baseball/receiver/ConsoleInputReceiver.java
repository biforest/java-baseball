package baseball.receiver;

import baseball.number.GameNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInputReceiver implements InputReceiver {

    private final Scanner scanner;

    public ConsoleInputReceiver(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int receiveContinueGameSelect() {
        int select;
        try {
            select = scanner.nextInt();
        } catch (InputMismatchException e) {
            cleanScannerBuffer();
            System.out.println("잘못된 입력입니다. 숫자만 입력해주세요.");
            return receiveContinueGameSelect();
        }

        return select;
    }

    @Override
    public GameNumber receiveUserNumber() throws  IllegalArgumentException, InputMismatchException {
        int number = scanner.nextInt();
        if (!GameNumber.validateNumber(number)) {
            throw new IllegalArgumentException();
        }
        return GameNumber.from(Integer.toString(number));
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
}
