package baseball.receiver;

import baseball.number.GameNumber;

public interface InputReceiver {

    boolean checkContinueGame();

    GameNumber receiveUserNumber();

    void dealWithExceptionalInput();
}
