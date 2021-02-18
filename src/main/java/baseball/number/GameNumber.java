package baseball.number;

import baseball.result.Result;

public class GameNumber {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public GameNumber() {
        value = "";
    }
    public GameNumber(String number) {
        if(!validateNumber(Integer.parseInt(number)))
            throw new IllegalArgumentException();
        this.value = number;
    }

    public void compare(GameNumber userNumber, Result result) {

    }

    public static boolean validateNumber(int number) {
        if(number <= 122 || number >=988)
            return false;

        boolean[] digits = new boolean[10];
        String strNumber = Integer.toString(number);

        for (char digit : strNumber.toCharArray()) {

            int integerDigit = Integer.parseInt(String.valueOf(digit));
            if (!digits[integerDigit]) {
                digits[integerDigit] = true;
                continue;
            }

            return false;
        }

        return true;
    }
}
