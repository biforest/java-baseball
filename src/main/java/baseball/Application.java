package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameManager manager = new GameManager(scanner);
        manager.run();
        scanner.close();
    }
}
