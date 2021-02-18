package baseball.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameNumberTest {

    @Test
    void compare() {
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