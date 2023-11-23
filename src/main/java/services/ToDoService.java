package services;

import java.util.List;

public interface ToDoService {
    public List<String> getTodos(String User);
    public void deleteTodos(String User);
}
