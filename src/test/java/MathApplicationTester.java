import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import business.CalculatorService;
import business.MathApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
	
   //@InjectMocks annotation is used to create and inject the mock object
   @InjectMocks
   MathApplication mathApplication = new MathApplication();

   //@Mock annotation is used to create the mock object to be injected
   @Mock
   CalculatorService calcService;

   @Test
   public void testAdd(){
      //add the behavior of calc service to add two numbers
      when(calcService.add(10.0,20.0)).thenReturn(30.00);
		
      //test the add functionality
      Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
   }
   @Test
   public void testSub(){
      when(calcService.subtract(20.0,10.0)).thenReturn(10.00);
      Double subtract=mathApplication.subtract(20,10);
      Assert.assertEquals(10,subtract,0);
   }
   @Test(expected = RuntimeException.class)
   public void testAdd1(){
      //add the behavior to throw exception
      doThrow(new RuntimeException("Add operation not implemented"))
              .when(calcService).add(10.0,20.0);

      //test the add functionality
      Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
   }

   @Test(expected = RuntimeException.class)
   public void sub(){
      doThrow(new RuntimeException("yes")).when(calcService).subtract(20,10);
      Assert.assertEquals(10,10,0);
   }
}