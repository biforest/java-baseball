package baseball.generator;

import baseball.number.GameNumber;
import utils.RandomUtils;

public class RandomNumberGenerator {

    public static void generate(GameNumber seedNumber) {
        if(seedNumber == null) {
            throw new NullPointerException();
        }

        int newSeed = 0;
        for (int exponent = 0; exponent < 3; exponent++) {
            int randomDigit = RandomUtils.nextInt(1, 9);
            newSeed += (Math.pow(10.0, exponent) * randomDigit);
        }

        if(!GameNumber.validateNumber(newSeed)){
            generate(seedNumber);
            return ;
        }

        seedNumber.setValue(Integer.toString(newSeed));
    }
}
