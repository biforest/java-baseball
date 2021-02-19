package baseball.receiver;

import baseball.number.GameNumber;

public interface InputReceiver {

    boolean checkContinueGame();

    void receiveUserNumber(GameNumber userNumber);

    void dealWithExceptionalInput();
}
