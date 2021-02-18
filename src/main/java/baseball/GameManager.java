package baseball;

import baseball.generator.RandomNumberGenerator;
import baseball.inputer.InnerGameInputer;
import baseball.inputer.OuterGameInputer;
import baseball.number.SeedNumber;
import baseball.number.UserNumber;
import baseball.printer.ConsolePrinter;
import baseball.printer.Printer;
import baseball.result.Result;

import java.util.Scanner;

public class GameManager {
    private final RandomNumberGenerator generator;
    private final Printer printer;
    private InnerGameInputer innerGameInputer;
    private OuterGameInputer outerGameInputer;
    private SeedNumber seedNumber;
    private UserNumber userNumber;

    public GameManager(Scanner scanner) {
        generator = new RandomNumberGenerator();
        printer = new ConsolePrinter();
        innerGameInputer = new InnerGameInputer(scanner);
        outerGameInputer = new OuterGameInputer(scanner);
        seedNumber = new SeedNumber();
        userNumber = new UserNumber();
    }

    public void run() {
        Result result = new Result();
        boolean continueGame = true;

        printer.greet();
        printer.askStartGame();
        continueGame = outerGameInputer.checkContinueGame();
        while(continueGame) {
            generator.generate(seedNumber);
            startGame(result);
            printer.askStartGame();
            continueGame = outerGameInputer.checkContinueGame();
        }
    }

    private void startGame(Result result) {

        while(result.isThreeStrike()) {
            printer.requestUserNumber();
            innerGameInputer.getUserNumber(userNumber);
            seedNumber.compare(userNumber, result);
            printer.printResult(result);
        }
    }
}
