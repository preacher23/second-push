import business.ToDoBusiness;
import business.Utility;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import services.ToDoService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;


public class testusing_Mocks {

    @Test
    public void test_using_mocks(){
        ToDoService toDoService= mock(ToDoService.class);
        List<String> list= Arrays.asList("gokul","gokul1");
        when(toDoService.getTodos("dummy")).thenReturn(list);
        ToDoBusiness toDoBusiness=new ToDoBusiness(toDoService);
        List<String>alllsit=toDoBusiness.getTodosforHibernate("dummy");
        Assert.assertEquals(1,alllsit);

    }
    @Test
    public void test(){
        List spyArraylist=spy(ArrayList.class);
        Assert.assertEquals(0,spyArraylist);
    }
    @Test
    public void testlist_returnsingle_value(){
        List mocklist=mock(List.class);
        when(mocklist.size()).thenReturn(1);
        Assert.assertEquals(1,mocklist.size());
    }
    @Test
    public void testList_Returns_Multiplevalues(){
        List mocklist=mock(List.class);
        when(mocklist.size()).thenReturn(1).thenReturn(2);
        Assert.assertEquals(1,mocklist.size());
        Assert.assertEquals(2,mocklist.size());
        System.out.println(mocklist.size());
    }
  @Test
    public void testlist_get(){
        List mocklist=mock(List.class);
        when(mocklist.get(0)).thenReturn("mockito");
        Assert.assertEquals("mockito",mocklist.get(0));
  }
  @Test
   public void testlist_add(){
        List mocklist=mock(List.class);
        when(mocklist.add("and")).thenReturn(true);
      Assert.assertNotNull(mocklist);
  }
  @Test
    public void testList_Argument_matcher(){
        List mocklist=mock(List.class);
        when(mocklist.get(Mockito.anyInt())).thenReturn("mockito");
        Assert.assertEquals("mockito",mocklist.get(0));
  }
  @Test(expected = RuntimeException.class)
    public void testlist_throwsException(){
        List mocklist=mock(List.class);
        when(mocklist.get(Mockito.anyInt())).thenThrow(RuntimeException.class);
      System.out.println(mocklist.get(0));
  }
  @Test
    public void Teststaticmethod_withpowermock(){
        String call="hi there im using powermock";
        String callexpectation="call expectation for you";
      PowerMockito.mockStatic(Utility.class);
      PowerMockito.when(Utility.staticmethod(call)).thenReturn(callexpectation);
      String actualcall = Utility.staticmethod(call);
      Assert.assertEquals(actualcall,call);
  }

//  @Test
//    public void Testprivatemethods() throws Exception {
//        String message="yes iam using powermock";
//        String expectedmessage="yeah we got it";
//        Utility mock =PowerMockito.spy(new Utility());
//        PowerMockito.doReturn(expectedmessage).when(mock,"privateMethod",message);
//        String actaulmessage=mock.privateMethod(message);
//        Assert.assertEquals(expectedmessage,actaulmessage);
//  }

}
