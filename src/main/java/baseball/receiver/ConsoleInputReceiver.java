package baseball.receiver;

import baseball.number.GameNumber;

import java.util.Scanner;

public class ConsoleInputReceiver implements InputReceiver {

    private final Scanner scanner;
    private final int START_GAME = 1;

    public ConsoleInputReceiver(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public boolean checkContinueGame() {
        int select = 0;

        try {
            select = receiveInputByIntAndClean();
            throwIfInputIsNotOneOrTwo(select);
        } catch (IllegalArgumentException exception) {
            cleanScannerBuffer();
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            return checkContinueGame();
        }

        return select == START_GAME;
    }

    @Override
    public void receiveUserNumber(GameNumber userNumber) throws  IllegalArgumentException {
        int number = receiveInputByIntAndClean();
        if(!GameNumber.validateNumber(number))
            throw new IllegalArgumentException();
        userNumber.setValue(Integer.toString(number));
    }

    private int receiveInputByIntAndClean() {
        int input = scanner.nextInt();
        cleanScannerBuffer();
        return input;
    }

    private void cleanScannerBuffer() {
        if(scanner.hasNext())
            scanner.nextLine();
    }

    private void throwIfInputIsNotOneOrTwo(int select) {
        if(select != 1 && select != 2)
            throw new IllegalArgumentException();
    }
}
