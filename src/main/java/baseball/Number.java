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

    //입력받은 수 배열로 변환
    public static ArrayList<Integer> splitNumber(Integer playerNumber) {
        ArrayList<Integer> splitPlayerNumber = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            splitPlayerNumber.add(0, playerNumber % 10);
            playerNumber /= 10;
        }
        return splitPlayerNumber;
    }

    //비정상적인 입력 처리
    public static void inputCheck(Integer number){
        is_Include_Zero(splitNumber(number));
        is_Not_ThreeDigits(number);
        is_overlap(splitNumber(number));
    }

    //세자리 수가 아닐 경우
    public static void is_Not_ThreeDigits(Integer number){
        if(number.toString().length()!=3)
            throw new IllegalArgumentException("올바른 입력이 아닙니다!");
    }

    //중복일 경우
    public static void is_overlap(ArrayList<Integer> number){
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0 ; i< 3; i++){
            if(temp.contains(number.get(i)))
                throw new IllegalArgumentException("올바른 입력이 아닙니다!");
            temp.add(number.get(i));
        }
    }

    //0이 입력될 경우
    public static void is_Include_Zero(ArrayList<Integer> number){
        if(number.contains(0))
            throw new IllegalArgumentException("올바른 입력이 아닙니다!");
    }
}