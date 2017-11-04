package com.daicham.catlog.application.service;

import com.daicham.catlog.domain.model.log.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public List<LogType> allTypes() {
        return Arrays.asList(LogType.values());
    }
}
