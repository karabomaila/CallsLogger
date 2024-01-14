package org.logger.callslogger.dao;

import org.logger.callslogger.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    public User findByEmailAndPassword(String email, String password);
}
