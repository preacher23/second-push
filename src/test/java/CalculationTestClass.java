import business.Calculation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationTestClass {

    @Test
    public void testFindMax(){
        assertEquals(4, Calculation.findMax(new int[]{12,3,4,0,0}));
    }
    @Test
    public void testCube(){
        System.out.println("test case cube");
        assertEquals(27,Calculation.cube(3));
    }
}
