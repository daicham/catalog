package com.daicham.catlog.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author daicham
 */
@RequestMapping("/")
@Controller
public class TopController {
    @GetMapping
    public String index() {
        return "forward:/logs";
    }
}
