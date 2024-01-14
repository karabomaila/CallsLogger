package org.logger.callslogger.service;

import org.logger.callslogger.dao.LogCallDao;
import org.logger.callslogger.model.LogCall;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogCallService {
    private LogCallDao logCallDao;

    public LogCallService(LogCallDao logCallDao){
        this.logCallDao = logCallDao;
    }

    public void save(LogCall logCall){
        logCallDao.save(logCall);
    }

    public LogCall findById(long id){
        return logCallDao.findById(id);
    }

    public List<LogCall> findAllBYUserId(long userId){
        return logCallDao.findAllByUserId(userId);
    }
}
