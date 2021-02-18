package baseball;

import utils.RandomUtils;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행

        GameManager manager = new GameManager(scanner);
        manager.run();
    }
}
