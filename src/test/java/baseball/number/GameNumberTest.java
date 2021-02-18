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

        userNumbers[0] = new GameNumber("123");
        seedNumbers[0] = new GameNumber("456");
        results[0] = new Result();

        userNumbers[1] = new GameNumber("984");
        seedNumbers[1] = new GameNumber("712");
        results[1] = new Result();

        userNumbers[2] = new GameNumber("921");
        seedNumbers[2] = new GameNumber("743");
        results[2] = new Result();

        userNumbers[3] = new GameNumber("652");
        seedNumbers[3] = new GameNumber("981");
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

        userNumbers[0] = new GameNumber("783");
        seedNumbers[0] = new GameNumber("582");
        results[0] = new Result();

        userNumbers[1] = new GameNumber("987");
        seedNumbers[1] = new GameNumber("237");
        results[1] = new Result();

        userNumbers[2] = new GameNumber("127");
        seedNumbers[2] = new GameNumber("597");
        results[2] = new Result();

        userNumbers[3] = new GameNumber("386");
        seedNumbers[3] = new GameNumber("746");
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

        userNumbers[0] = new GameNumber("783");
        seedNumbers[0] = new GameNumber("287");
        results[0] = new Result();

        userNumbers[1] = new GameNumber("987");
        seedNumbers[1] = new GameNumber("497");
        results[1] = new Result();

        userNumbers[2] = new GameNumber("127");
        seedNumbers[2] = new GameNumber("917");
        results[2] = new Result();

        userNumbers[3] = new GameNumber("386");
        seedNumbers[3] = new GameNumber("236");
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

        userNumbers[0] = new GameNumber("783");
        seedNumbers[0] = new GameNumber("387");
        results[0] = new Result();

        userNumbers[1] = new GameNumber("987");
        seedNumbers[1] = new GameNumber("897");
        results[1] = new Result();

        userNumbers[2] = new GameNumber("127");
        seedNumbers[2] = new GameNumber("217");
        results[2] = new Result();

        userNumbers[3] = new GameNumber("386");
        seedNumbers[3] = new GameNumber("836");
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

        userNumbers[0] = new GameNumber("783");
        seedNumbers[0] = new GameNumber("583");
        results[0] = new Result();

        userNumbers[1] = new GameNumber("987");
        seedNumbers[1] = new GameNumber("287");
        results[1] = new Result();

        userNumbers[2] = new GameNumber("127");
        seedNumbers[2] = new GameNumber("137");
        results[2] = new Result();

        userNumbers[3] = new GameNumber("386");
        seedNumbers[3] = new GameNumber("382");
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

        userNumbers[0] = new GameNumber("783");
        seedNumbers[0] = new GameNumber("783");
        results[0] = new Result();

        userNumbers[1] = new GameNumber("987");
        seedNumbers[1] = new GameNumber("987");
        results[1] = new Result();

        userNumbers[2] = new GameNumber("127");
        seedNumbers[2] = new GameNumber("127");
        results[2] = new Result();

        userNumbers[3] = new GameNumber("386");
        seedNumbers[3] = new GameNumber("386");
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