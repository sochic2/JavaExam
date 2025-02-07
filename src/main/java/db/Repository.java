package db;

import model.User;

public interface Repository {
    void insert();

    User findById(String id);
}
