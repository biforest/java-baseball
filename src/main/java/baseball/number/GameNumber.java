package baseball.number;

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
