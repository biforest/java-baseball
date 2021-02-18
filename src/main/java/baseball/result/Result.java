package baseball.result;

public class Result {
    private int strikeCount;
    private int ballCount;
    public Result() {
        this.strikeCount = 0;
        this.ballCount = 0;
    }
    public Result(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public boolean isThreeStrike() {
        return strikeCount == 3;
    }

    public boolean isNothing() {
        return strikeCount == 0 && ballCount == 0;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public void setStrikeCount(int strikeCount) {
        this.strikeCount = strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public void setBallCount(int ballCount) {
        this.ballCount = ballCount;
    }
}
