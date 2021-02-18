package baseball;

import baseball.generator.RandomNumberGenerator;
import baseball.inputer.InnerGameInputer;
import baseball.inputer.OuterGameInputer;
import baseball.number.SeedNumber;
import baseball.number.UserNumber;
import baseball.printer.InnerGamePrinter;
import baseball.printer.OuterGamePrinter;
import baseball.result.Result;

import java.util.Scanner;

public class GameManager {
    private RandomNumberGenerator generator;
    private InnerGamePrinter innerGamePrinter;
    private OuterGamePrinter outerGamePrinter;
    private InnerGameInputer innerGameInputer;
    private OuterGameInputer outerGameInputer;
    private SeedNumber seedNumber;
    private UserNumber userNumber;

    public GameManager(Scanner scanner) {
        generator = new RandomNumberGenerator();
        innerGamePrinter = new InnerGamePrinter();
        outerGamePrinter = new OuterGamePrinter();
        innerGameInputer = new InnerGameInputer(scanner);
        outerGameInputer = new OuterGameInputer(scanner);
    }

    public void run() {
        Result result = new Result();
        boolean continueGame = true;

        outerGamePrinter.greet();
        continueGame = outerGameInputer.getGameStart();
        while(continueGame) {
            //새로운게임 시작
            generator.generate(seedNumber);
            //반복
            startGame(result);
            //맞으면 탈출
            //재시작 의사 확인
            outerGamePrinter.askRestartGame();
            continueGame = outerGameInputer.getGameStart();
        }
    }

    private void startGame(Result result) {

        while(result.isThreeStrike()) {
            innerGamePrinter.requestUserNumber();
            //입력받고
            innerGameInputer.getUserNumber(userNumber);
            //비교
            seedNumber.compare(userNumber, result);
            //결과 출력
            innerGamePrinter.printResult(result);
            //틀리면 반복
        }
    }
}
