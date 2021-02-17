package baseball;


import java.util.Scanner;

public class GamePlayer {

    public static void play(Scanner Input){
        Number random = new Number();
        Number player = new Number();

        random.setNumber(random.createNumber());

            System.out.print("숫자를 입력해 주세요 : ");
            player.setNumber(Number.splitNumber(Input.nextInt()));
            System.out.println(player.getNumber());

    }


}