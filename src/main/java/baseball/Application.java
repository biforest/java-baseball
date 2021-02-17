package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        GamePlayer gamePlayer = new GamePlayer();

        //게임 시작
        gamePlayer.play(scanner);
        
    }
}
