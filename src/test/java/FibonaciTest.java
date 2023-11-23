import business.FibonacciClass;
import org.junit.Assert;
import org.junit.Test;

public class FibonaciTest {
    @Test
    public void fibonaciMethodTest(){
        //int firstterm=1;
        FibonacciClass fibonacciClass=new FibonacciClass();
        Assert.assertEquals(55,fibonacciClass.fibonacci());
    }
}
