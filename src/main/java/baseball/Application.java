package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        GamePlayer gamePlayer = new GamePlayer();

        //게임 시작
        while(true){
        gamePlayer.play(scanner);
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        if(scanner.nextInt()==1)
            continue;
        break;
        }
        
    }
}
