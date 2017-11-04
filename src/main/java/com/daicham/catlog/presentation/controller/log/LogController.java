package com.daicham.catlog.presentation.controller.log;

import com.daicham.catlog.application.service.LogService;
import com.daicham.catlog.domain.model.log.Log;
import com.daicham.catlog.domain.model.log.LogId;
import com.daicham.catlog.domain.model.log.Logs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author daicham
 */
@RequestMapping("/logs")
@Controller
public class LogController {

    @Autowired
    LogService service;

    @GetMapping
    public String list(Model model) {
        Logs logs = service.findRecent();
        model.addAttribute("logs", logs);
        return "log/list";
    }

    @GetMapping("new")
    public String newOne(@ModelAttribute Log log) {
        return "log/new";
    }

    @PostMapping("new")
    public String register(@Valid Log log, BindingResult result) {
        if (result.hasErrors()) {
            return "log/new";
        }
        service.register(log);
        return redirectToList();
    }

    @GetMapping("{id:[0-9]+}")
    public String edit(@PathVariable LogId id, Model model) {
        Log log = service.findBy(id);
        model.addAttribute("log", log);
        return "log/edit";
    }

    @PostMapping("{id:[0-9]+}")
    public String update(@Valid Log log, BindingResult result) {
        if (result.hasErrors()) {
            return "log/edit";
        }
        service.update(log);
        return redirectToList();
    }

    @PostMapping("{id:[0-9]+}/delete")
    public String delete(@PathVariable LogId id) {
        service.delete(id);
        return redirectToList();
    }

    private String redirectToList() {
        return "redirect:/logs";
    }
}
