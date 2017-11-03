package com.daicham.catlog.infrastructure;

import com.daicham.catlog.domain.model.log.Log;
import com.daicham.catlog.domain.model.log.LogId;
import com.daicham.catlog.domain.model.log.Logs;
import com.daicham.catlog.domain.model.log.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author daicham
 */
@Repository
public class LogDataSource implements LogRepository {
    @Autowired
    LogMapper mapper;

    @Override
    public Log findBy(LogId id) {
        return mapper.findBy(id);
    }

    @Override
    public Logs findRecent() {
        return new Logs(mapper.findRecent());
    }

    @Override
    public void register(Log log) {
        mapper.register(log);
    }

    @Override
    public void update(Log log) {
        mapper.update(log);
    }

    @Override
    public void delete(LogId id) {
        mapper.delete(id);
    }
}
