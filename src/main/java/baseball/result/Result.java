package baseball.result;

import baseball.number.GameNumber;

public class Result {
    private int strikeCount;
    private int ballCount;
    
    public Result() {
        this.strikeCount = 0;
        this.ballCount = 0;
    }

    public void calculateResult(GameNumber seedNumber, GameNumber userNumber) {
        calculateStrikeCount(seedNumber, userNumber);
        calculateBallCount(seedNumber, userNumber);
    }

    private void calculateStrikeCount(GameNumber seedNumber, GameNumber userNumber) {
        int strikeCount = 0;
        String seedValue = seedNumber.getValue();
        String userValue = userNumber.getValue();

        for (int i = 0; i < seedValue.length(); i++) {
            if (userValue.charAt(index) == seedValue.charAt(index)) {
                strikeCount++;
            }
        }
        this.strikeCount = strikeCount;
    }

    private void calculateBallCount(GameNumber seedNumber, GameNumber userNumber) {
        String seedValue = seedNumber.getValue();
        String userValue = userNumber.getValue();
        int ballCount = (int) seedValue.codePoints()
                .mapToObj(digit -> (char) digit)
                .filter(digit -> userValue.indexOf(digit) != -1)
                .count();
        this.ballCount = ballCount - strikeCount;
    }

    public boolean isWin() {
        return strikeCount == 3;
    }

    public boolean isNothing() {
        return strikeCount == 0 && ballCount == 0;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }
}
