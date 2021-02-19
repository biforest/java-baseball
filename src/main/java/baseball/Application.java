package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GameManager manager = new GameManager(scanner);
            manager.run();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
