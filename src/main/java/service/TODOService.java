package service;

import model.TODO;
import repositories.TODOrepository;

import java.util.Collection;

public class TODOService {

    private TODOrepository todorepository = new TODOrepository();

    public Collection<TODO> getUsersTodoList(String username) {
        return todorepository.getTodoes(username);
    }

}
