package baseball.receiver;

public interface InputReceiver {

    int receiveContinueGameSelect();

    String receiveUserNumber();

    void dealWithExceptionalInput();
}
