package baseball.generator;

import baseball.number.GameNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    @Test
    void 생성된_난수가_게임_숫자_생성규칙에_부합하는지_100회_검증() {

        GameNumber randomNumber;

        for (int loop = 0; loop < 100; loop++) {
            //given
            randomNumber = RandomNumberGenerator.generate();
            int integerRandomNumber = Integer.parseInt(randomNumber.getValue());

            //when, then
            assertTrue(GameNumber.validateNumber(integerRandomNumber));
        }
    }
}