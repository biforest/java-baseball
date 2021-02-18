package baseball;


import java.util.Scanner;

import static baseball.Number.*;

public class GamePlayer {

    public static void play(Scanner Input){
        Number random = new Number();
        Number player = new Number();
        Integer temp;

        //랜덤 수 생성
        random.setNumber(random.createNumber());

        //입력 받고 비정상적인 입력 처리
        System.out.print("숫자를 입력해 주세요 : ");
        temp = Input.nextInt();
        inputCheck(temp);

        //입력 수 저장
        player.setNumber(splitNumber(temp));

    }



}