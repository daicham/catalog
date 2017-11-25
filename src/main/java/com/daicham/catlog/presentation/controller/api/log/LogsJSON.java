package com.daicham.catlog.presentation.controller.api.log;

import com.daicham.catlog.domain.model.log.Logs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author daicham
 */
public class LogsJSON implements Iterable<LogJSON> {
    List<LogJSON> logs = new ArrayList<>();

    private LogsJSON(Logs logs) {
        this.logs.addAll(logs.stream().map(LogJSON::of).collect(Collectors.toList()));
    }

    static LogsJSON of(Logs logs) {
        return new LogsJSON(logs);
    }

    @Override
    public Iterator<LogJSON> iterator() {
        return logs.iterator();
    }
}
