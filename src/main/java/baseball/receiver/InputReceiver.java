package baseball.receiver;

import baseball.number.GameNumber;

public interface InputReceiver {

    int receiveContinueGameSelect();

    GameNumber receiveUserNumber();

    void dealWithExceptionalInput();
}
