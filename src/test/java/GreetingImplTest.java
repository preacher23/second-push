import org.example.GreetingImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {
    private GreetingImpl greeting;
    @Before
    public void setUp(){

        greeting = new GreetingImpl();
    }
    @Test
    public void greetShould(){
        String name = greeting.greet("gokul");
        Assert.assertNotNull(name);
    }
    @Test(expected = IllegalArgumentException.class)
    public void greetShouldThrowAnException(){
        greeting.greet(null);
    }
    @Test
    public void greetShouldThrowAnNull(){
        greeting.greet("");
    }
}
