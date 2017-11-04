package com.daicham.catlog.domain.model.log;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author daicham
 */
public class OccurredAt {
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    LocalDateTime value = LocalDateTime.now();

    public String asText() {
        return value.format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
