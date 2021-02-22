package baseball.number;

import baseball.result.Result;

public class GameNumber {
    private String value;
    private GameNumber(String number) {
        value = number;
    }

    public static GameNumber from(String number) {
        if (!validateNumber(Integer.parseInt(number))) {
            throw new IllegalArgumentException();
        }
        return new GameNumber(number);
    }

    public void compare(GameNumber userNumber, Result result) {
        int strikeCount =0, ballCount = 0;
        boolean[] digits = new boolean[10];
        String userValue = userNumber.getValue();

        for (int index = 0; index < value.length(); index++) {
            char seedCharAtIndex = value.charAt(index);
            if (userValue.charAt(index) == seedCharAtIndex) {
                strikeCount++;
                continue;
            }

            int seedCharIndex = Integer.parseInt(String.valueOf(seedCharAtIndex));
            digits[seedCharIndex] = true;
        }

        for (char digit : userValue.toCharArray()) {
            int digitIndex = Integer.parseInt(String.valueOf(digit));
            if (digits[digitIndex]) {
                ballCount++;
            }
        }

        result.setBallCount(ballCount);
        result.setStrikeCount(strikeCount);
    }

    public static boolean validateNumber(int number) {
        if (number <= 122 || number >=988) {
            return false;
        }

        boolean[] digits = new boolean[10];
        String strNumber = Integer.toString(number);

        for (char digit : strNumber.toCharArray()) {

            int integerDigit = Integer.parseInt(String.valueOf(digit));
            if (integerDigit == 0) {
                return false;
            }
            if (!digits[integerDigit]) {
                digits[integerDigit] = true;
                continue;
            }
            return false;
        }

        return true;
    }

    public String getValue() {
        return value;
    }
}
