package business;

import services.ToDoService;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {
    private ToDoService toDoService;
    public ToDoBusiness(ToDoService toDoService){
        this.toDoService=toDoService;
    }
    public List<String>getTodosforHibernate(String user){
     List<String> hibernatelist= new ArrayList<>();
     List<String> combinedlist=toDoService.getTodos(user);
     for (String todo:combinedlist){
         if (todo.contains("Hibernate")){
             hibernatelist.add(todo);
         }
     }
     return hibernatelist;
    }

    public void deleteTodosNotrelatedtoHibernate(String user){
      List<String> combinedlist= toDoService.getTodos(user);
      for (String todos: combinedlist){
          if (!todos.contains("hibernate")){
              toDoService.deleteTodos(todos);
          }
      }
    }
}
