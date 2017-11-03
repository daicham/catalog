package com.daicham.catlog.application.service;

import com.daicham.catlog.domain.model.log.Log;
import com.daicham.catlog.domain.model.log.LogId;
import com.daicham.catlog.domain.model.log.Logs;
import com.daicham.catlog.domain.model.log.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author daicham
 */
@Service
public class LogService {
    @Autowired
    LogRepository repository;

    public Log findBy(LogId id) {
        return repository.findBy(id);
    }

    public Logs findRecent() {
        return repository.findRecent();
    }

    public void register(Log log) {
        repository.register(log);
    }

    public void update(Log log) {
        repository.update(log);
    }

    public void delete(LogId id) {
        repository.delete(id);
    }
}
