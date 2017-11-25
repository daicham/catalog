package com.daicham.catlog.presentation.controller.api.log;

import com.daicham.catlog.application.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daicham
 */
@RestController
@RequestMapping("/api/logs"
//        ,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
)
public class LogApiController {

    @Autowired
    LogService logService;

    @GetMapping
    public LogsJSON logs() {
        return LogsJSON.of(logService.findRecent());
    }
}
