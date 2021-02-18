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

        int strikeCount =0, ballCount = 0;
        boolean[] digits = new boolean[10];
        String userValue = userNumber.getValue();

        for (int index = 0; index < value.length(); index++) {
            char userCharAtIndex = userValue.charAt(index);
            if(userCharAtIndex == value.charAt(index)) {
                strikeCount++;
                continue;
            }

            digits[userCharAtIndex] = true;
        }

        for (char digit : userValue.toCharArray()) {
            if (digits[digit]) {
                ballCount++;
            }
        }

        result.setBallCount(ballCount);
        result.setStrikeCount(strikeCount);
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
