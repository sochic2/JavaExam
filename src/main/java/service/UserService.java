package service;

import db.Repository;
import model.User;

public class UserService {
    private Repository repository;

    public UserService(Repository repository) {
        this.repository = repository;
    }

    public void insert() {

    }

    public User findById(String id) {
        return repository.findById(id);
    }

}
