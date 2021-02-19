package baseball.printer;

import baseball.result.Result;

public class ConsolePrinter implements Printer {

    @Override
    public void greet() {
        System.out.println("숫자 야구 게임입니다.\n" +
                            "게임을 시작하시겠습니까?");
    }

    @Override
    public void askStartGame() {
        System.out.println("시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    @Override
    public void requestUserNumber() {
        System.out.print("숫자를 입렧해주세요 : ");
    }

    @Override
    public void warnInvalidInput() {
        System.out.println("올바르지 않은 입력입니다.\n" +
                            "서로 다른 숫자 세 자리를 입력해주세요.");
    }

    @Override
    public void printResult(Result result) {
        if(result.isNothing()) {
            System.out.println("낫싱");
            return ;
        }
        
        if(result.getBallCount() != 0)
            System.out.print(result.getBallCount() + "볼 ");

        if(result.getStrikeCount() != 0)
            System.out.print(result.getStrikeCount() + "스트라이크");
        System.out.println();
    }

    @Override
    public void noticeWin() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
