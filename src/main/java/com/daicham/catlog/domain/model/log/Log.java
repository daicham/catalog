package com.daicham.catlog.domain.model.log;

/**
 * @author daicham
 */
public class Log {
    LogId id;
    LogType type;
    Memo memo;
    OccurredAt occurredAt;
    CreatedAt createdAt;

    public Log() {
        this.occurredAt = new OccurredAt();
        this.memo = new Memo();
    }

    public LogId getId() {
        return id;
    }

    public LogType getType() {
        return type;
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
