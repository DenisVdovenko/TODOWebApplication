package service;

import model.TODO;
import repositories.TODOrepository;

import java.util.Collection;

public class TODOService {

    private TODOrepository todOrepository = new TODOrepository();

    public Collection<TODO> getUsersTodoList(String username) {
        return todOrepository.getTodoes(username);
    }

}
