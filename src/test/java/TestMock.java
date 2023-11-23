import business.ToDoBusiness;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import services.ToDoService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


public class TestMock {
    @InjectMocks
    ToDoBusiness toDoBusiness;
    @Mock
    ToDoService toDoService;

    @Test
    public void testusing_Mocks() {



        List<String> combinedlist = Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use w3eHibernate ", " Use Spring MVC ");
        if (toDoService!=null) {
            System.out.println("yes");
            when(toDoService.getTodos("dummy")).thenReturn(combinedlist);
        }



        List<String> alltd = toDoBusiness.getTodosforHibernate("dummy");

        System.out.println(alltd);
        assertEquals(1, alltd.size());
    }
}
