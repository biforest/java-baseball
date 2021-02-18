package baseball.printer;

public class OuterGamePrinter  {

    private final String greetMessage =
                    "숫자 야구 게임입니다.\n" +
                    "게임을 시작하시겠습니까?";
    private final String startCheckMessage =
                    "시작하려면 1, 종료하려면 2를 입력하세요.";

    public OuterGamePrinter() {
    }

    public void greet() {
        System.out.println(greetMessage);
    }
    public void askStartGame() {
        System.out.println(startCheckMessage);
    }
}
