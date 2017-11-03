package com.daicham.catlog.domain.model.log;

/**
 * @author daicham
 */
public interface LogRepository {
    Log findBy(LogId id);

    Logs findRecent();

    void register(Log log);

    void update(Log log);

    void delete(LogId id);
}
