package com.daicham.catlog.presentation.controller.api.log;

import com.daicham.catlog.domain.model.log.Log;

/**
 * @author daicham
 */
public class LogJSON {
    public String id;
    public String type;
    public String memo;
    public String occurredAt;

    private LogJSON(Log log) {
        id = log.getId().getValue();
        type = log.getType().asText();
        memo = log.getMemo().asText();
        occurredAt = log.getOccurredAt().asText();
    }

    static LogJSON of(Log log) {
        return new LogJSON(log);
    }
}
