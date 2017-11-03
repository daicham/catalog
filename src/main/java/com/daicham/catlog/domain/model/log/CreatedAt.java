package com.daicham.catlog.domain.model.log;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author daicham
 */
public class CreatedAt {
    LocalDateTime value;

    public String asText() {
        return value.format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
