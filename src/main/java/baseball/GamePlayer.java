package baseball;

import java.util.InputMismatchException;
import java.util.Scanner;

import static baseball.Number.*;

public class GamePlayer {

    public static void play(Scanner Input){
        Number random = new Number();
        Number player = new Number();

        Integer temp;

        //랜덤 수 생성
        random.setNumber(random.createNumber());

        //게임 내 n트
        while(true) {
            //입력 받고 비정상적인 입력 처리하고 저장
            System.out.print("숫자를 입력해 주세요 : ");
            try {
                temp = Input.nextInt();
            }catch (InputMismatchException e) {
                throw new IllegalArgumentException("올바른 입력이 아닙니다!");
            }

            inputCheck(temp);
            player.setNumber(splitNumber(temp));

            Referee referee = new Referee();
            if (referee.judgement(random.getNumber(), player.getNumber()))
                break;
        }

    }

}