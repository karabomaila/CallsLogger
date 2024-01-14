package org.logger.callslogger.dao;

import org.logger.callslogger.model.LogCall;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogCallDao extends JpaRepository<LogCall, Long> {
    public LogCall findById(long id);

    public List<LogCall> findAllByUserId(long userId);
}
