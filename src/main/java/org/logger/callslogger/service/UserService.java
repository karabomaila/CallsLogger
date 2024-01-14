package org.logger.callslogger.service;

import org.logger.callslogger.dao.UserDao;
import org.logger.callslogger.model.User;
import org.springframework.stereotype.Service;

import java.security.PublicKey;

@Service
public class UserService {
    private UserDao userDao;
    public UserService(UserDao userDao){
        this.userDao = userDao;
    }

    public void save(User user){
        userDao.save(user);
    }

    public User findUserByEmailAndPassword(User user){
        return userDao.findByEmailAndPassword(user.getEmail(), user.getPassword());
    }
}
