package com.daicham.catlog.domain.model.log;

/**
 * @author daicham
 */
public class Log {
    LogId id;
    Memo memo;
    OccurredAt occurredAt;
    CreatedAt createdAt;

    public LogId getId() {
        return id;
    }

    public Memo getMemo() {
        return memo;
    }

    public OccurredAt getOccurredAt() {
        return occurredAt;
    }

    public CreatedAt getCreatedAt() {
        return createdAt;
    }
}
