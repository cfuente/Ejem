package eu.eurogestion.eSe.service;

import eu.eurogestion.eSe.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
