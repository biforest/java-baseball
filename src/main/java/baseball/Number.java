package baseball;

import utils.RandomUtils;

import java.util.ArrayList;

public class Number {
    private ArrayList<Integer>  number;

    public ArrayList<Integer>  getNumber() {
        return number;
    }

    public void setNumber(ArrayList<Integer> playerNumber) {
        this.number = playerNumber;
    }

    //임의의 수 3개 생성
    public static ArrayList<Integer>  createNumber(){
        ArrayList<Integer> result = new ArrayList<>();
        int temp;

        //중복 수 제거
        for(int i = 0 ; i<3; i++) {
            temp = RandomUtils.nextInt(1, 9);

            if (!result.contains(temp))
                result.add(temp);
            else
                i--;
        }
        return result;
    }

    public static ArrayList<Integer> splitNumber(int playerNumber) {
        ArrayList<Integer> splitPlayerNumber = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            splitPlayerNumber.add(0, playerNumber % 10);
            playerNumber /= 10;
        }
        return splitPlayerNumber;
    }
}