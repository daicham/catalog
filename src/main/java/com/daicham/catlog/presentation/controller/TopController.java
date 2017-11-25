package com.daicham.catlog.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.Objects;

/**
 * @author daicham
 */
@RequestMapping("/")
@Controller
public class TopController {
    @GetMapping
    public String index(Principal principal) {
        return isAuthenticated(principal) ? "forward:/logs" : "index";
    }

    private boolean isAuthenticated(Principal principal) {
        return Objects.nonNull(principal);
    }
}
