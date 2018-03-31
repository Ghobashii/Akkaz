package com.SweProject.Akkaz.Services;

import com.SweProject.Akkaz.models.User;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UserService {

    Collection<User> getAllUsers();

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    void createUser(User user);
}
