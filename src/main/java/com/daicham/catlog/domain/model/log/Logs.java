package com.daicham.catlog.domain.model.log;

import java.util.Iterator;
import java.util.List;

/**
 * @author daicham
 */
public class Logs implements Iterable<Log> {
    List<Log> value;

    public Logs(List<Log> value) {
        this.value = value;
    }

    @Override
    public Iterator<Log> iterator() {
        return value.iterator();
    }
}
