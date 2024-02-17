import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class SampleCalculatorTest {
    @Test
    public void sumOfTwoSuccesTest(){
        Assert.assertEquals(4,SampleCalculator.sumOfTwo(1,3));
    }

    @Test
    public void sumOfThreeSuccesTest(){
        Assert.assertEquals(6,SampleCalculator.sumOfThree(1,3,2));
    }
    @Test
    public void DivideTwoSuccesTest(){
        Assert.assertThrows(ArithmeticException.class, ()->SampleCalculator.divideTwo(6,0));
    }
}
