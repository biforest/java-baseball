package baseball.number;

import baseball.result.Result;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameNumberTest {

    @Test
    void case_노카운트_검증() {
        //given
        final int TEST_CASE_NUM = 4;
        GameNumber[] userNumbers = new GameNumber[TEST_CASE_NUM];
        GameNumber[] seedNumbers = new GameNumber[TEST_CASE_NUM];
        Result[] results = new Result[TEST_CASE_NUM];

        userNumbers[0] = GameNumber.from("123");
        seedNumbers[0] = GameNumber.from("456");
        results[0] = new Result();

        userNumbers[1] = GameNumber.from("984");
        seedNumbers[1] = GameNumber.from("712");
        results[1] = new Result();

        userNumbers[2] = GameNumber.from("921");
        seedNumbers[2] = GameNumber.from("743");
        results[2] = new Result();

        userNumbers[3] = GameNumber.from("652");
        seedNumbers[3] = GameNumber.from("981");
        results[3] = new Result();

        for (int testCase = 0; testCase < TEST_CASE_NUM; testCase++) {
            //when
            seedNumbers[testCase].compare(userNumbers[testCase], results[testCase]);
            //then
            assertEquals(results[testCase].getBallCount(), 0);
            assertEquals(results[testCase].getStrikeCount(), 0);
        }
    }

    @Test
    void case_1스트라이크_검증() {
        //given
        final int TEST_CASE_NUM = 4;
        GameNumber[] userNumbers = new GameNumber[TEST_CASE_NUM];
        GameNumber[] seedNumbers = new GameNumber[TEST_CASE_NUM];
        Result[] results = new Result[TEST_CASE_NUM];

        userNumbers[0] = GameNumber.from("783");
        seedNumbers[0] = GameNumber.from("582");
        results[0] = new Result();

        userNumbers[1] = GameNumber.from("987");
        seedNumbers[1] = GameNumber.from("237");
        results[1] = new Result();

        userNumbers[2] = GameNumber.from("127");
        seedNumbers[2] = GameNumber.from("597");
        results[2] = new Result();

        userNumbers[3] = GameNumber.from("386");
        seedNumbers[3] = GameNumber.from("746");
        results[3] = new Result();

        for (int testCase = 0; testCase < TEST_CASE_NUM; testCase++) {
            //when
            seedNumbers[testCase].compare(userNumbers[testCase], results[testCase]);
            //then
            assertEquals(results[testCase].getBallCount(), 0);
            assertEquals(results[testCase].getStrikeCount(), 1);
        }
    }

    @Test
    void case_1스트라이크_1볼_검증() {
        //given
        final int TEST_CASE_NUM = 4;
        GameNumber[] userNumbers = new GameNumber[TEST_CASE_NUM];
        GameNumber[] seedNumbers = new GameNumber[TEST_CASE_NUM];
        Result[] results = new Result[TEST_CASE_NUM];

        userNumbers[0] = GameNumber.from("783");
        seedNumbers[0] = GameNumber.from("287");
        results[0] = new Result();

        userNumbers[1] = GameNumber.from("987");
        seedNumbers[1] = GameNumber.from("497");
        results[1] = new Result();

        userNumbers[2] = GameNumber.from("127");
        seedNumbers[2] = GameNumber.from("917");
        results[2] = new Result();

        userNumbers[3] = GameNumber.from("386");
        seedNumbers[3] = GameNumber.from("236");
        results[3] = new Result();

        for (int testCase = 0; testCase < TEST_CASE_NUM; testCase++) {
            //when
            seedNumbers[testCase].compare(userNumbers[testCase], results[testCase]);
            //then
            assertEquals(results[testCase].getBallCount(), 1);
            assertEquals(results[testCase].getStrikeCount(), 1);
        }
    }

    @Test
    void case_1스트라이크_2볼_검증() {
        //given
        final int TEST_CASE_NUM = 4;
        GameNumber[] userNumbers = new GameNumber[TEST_CASE_NUM];
        GameNumber[] seedNumbers = new GameNumber[TEST_CASE_NUM];
        Result[] results = new Result[TEST_CASE_NUM];

        userNumbers[0] = GameNumber.from("783");
        seedNumbers[0] = GameNumber.from("387");
        results[0] = new Result();

        userNumbers[1] = GameNumber.from("987");
        seedNumbers[1] = GameNumber.from("897");
        results[1] = new Result();

        userNumbers[2] = GameNumber.from("127");
        seedNumbers[2] = GameNumber.from("217");
        results[2] = new Result();

        userNumbers[3] = GameNumber.from("386");
        seedNumbers[3] = GameNumber.from("836");
        results[3] = new Result();

        for (int testCase = 0; testCase < TEST_CASE_NUM; testCase++) {
            //when
            seedNumbers[testCase].compare(userNumbers[testCase], results[testCase]);
            //then
            assertEquals(results[testCase].getBallCount(), 2);
            assertEquals(results[testCase].getStrikeCount(), 1);
        }
    }

    @Test
    void case_2스트라이크_검증() {
        //given
        final int TEST_CASE_NUM = 4;
        GameNumber[] userNumbers = new GameNumber[TEST_CASE_NUM];
        GameNumber[] seedNumbers = new GameNumber[TEST_CASE_NUM];
        Result[] results = new Result[TEST_CASE_NUM];

        userNumbers[0] = GameNumber.from("783");
        seedNumbers[0] = GameNumber.from("583");
        results[0] = new Result();

        userNumbers[1] = GameNumber.from("987");
        seedNumbers[1] = GameNumber.from("287");
        results[1] = new Result();

        userNumbers[2] = GameNumber.from("127");
        seedNumbers[2] = GameNumber.from("137");
        results[2] = new Result();

        userNumbers[3] = GameNumber.from("386");
        seedNumbers[3] = GameNumber.from("382");
        results[3] = new Result();

        for (int testCase = 0; testCase < TEST_CASE_NUM; testCase++) {
            //when
            seedNumbers[testCase].compare(userNumbers[testCase], results[testCase]);
            //then
            assertEquals(results[testCase].getBallCount(), 0);
            assertEquals(results[testCase].getStrikeCount(), 2);
        }
    }

    @Test
    void case_3스트라이크_검증() {
        //given
        final int TEST_CASE_NUM = 4;
        GameNumber[] userNumbers = new GameNumber[TEST_CASE_NUM];
        GameNumber[] seedNumbers = new GameNumber[TEST_CASE_NUM];
        Result[] results = new Result[TEST_CASE_NUM];

        userNumbers[0] = GameNumber.from("783");
        seedNumbers[0] = GameNumber.from("783");
        results[0] = new Result();

        userNumbers[1] = GameNumber.from("987");
        seedNumbers[1] = GameNumber.from("987");
        results[1] = new Result();

        userNumbers[2] = GameNumber.from("127");
        seedNumbers[2] = GameNumber.from("127");
        results[2] = new Result();

        userNumbers[3] = GameNumber.from("386");
        seedNumbers[3] = GameNumber.from("386");
        results[3] = new Result();

        for (int testCase = 0; testCase < TEST_CASE_NUM; testCase++) {
            //when
            seedNumbers[testCase].compare(userNumbers[testCase], results[testCase]);
            //then
            assertEquals(results[testCase].getBallCount(), 0);
            assertEquals(results[testCase].getStrikeCount(), 3);
        }
    }

    @Test
    void 세자리수_입력이_아니면_false() {
        //given
        int input1 = 1000;
        int input2 = -1;
        int input3 = 23;
        int input4 = 99;

        //when, then
        assertFalse(GameNumber.validateNumber(input1));
        assertFalse(GameNumber.validateNumber(input2));
        assertFalse(GameNumber.validateNumber(input3));
        assertFalse(GameNumber.validateNumber(input4));
    }

    @Test
    public void 세자리_수이지만_서로_다른_숫자가_아니면_false() {
        //given
        int input1 = 110;
        int input2 = 122;
        int input3 = 999;
        int input4 = 575;
        int input5 = 100;

        //when, then
        assertFalse(GameNumber.validateNumber(input1));
        assertFalse(GameNumber.validateNumber(input2));
        assertFalse(GameNumber.validateNumber(input3));
        assertFalse(GameNumber.validateNumber(input4));
        assertFalse(GameNumber.validateNumber(input5));
    }

    @Test
    public void 세자리_수이면서_각_자리_숫자가_서로_다른_숫자이면_true() {
        //given
        int input1 = 564;
        int input2 = 679;
        int input3 = 541;
        int input4 = 908;
        int input5 = 543;

        //when, then
        assertTrue(GameNumber.validateNumber(input2));
        assertTrue(GameNumber.validateNumber(input1));
        assertTrue(GameNumber.validateNumber(input3));
        assertTrue(GameNumber.validateNumber(input4));
        assertTrue(GameNumber.validateNumber(input5));
    }
}