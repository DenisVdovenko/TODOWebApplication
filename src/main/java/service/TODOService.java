package service;

import model.TODO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TODOService {

    public Collection<TODO> getMyTODOList(){
        List<TODO> todoList = new ArrayList<>();
        todoList.add(new TODO(1L, false, "first comment"));
        todoList.add(new TODO(2L, true, "second comment"));
        return todoList;
    }

}
