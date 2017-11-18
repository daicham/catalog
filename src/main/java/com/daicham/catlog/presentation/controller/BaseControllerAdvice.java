package com.daicham.catlog.presentation.controller;

import com.daicham.catlog.application.service.OwnerService;
import com.daicham.catlog.domain.model.owner.Owner;
import com.daicham.catlog.domain.model.owner.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @author daicham
 */
@ControllerAdvice
public class BaseControllerAdvice { //TODO modify class name to better

    @Autowired
    OwnerService ownerService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.initDirectFieldAccess();
    }

    @ModelAttribute
    public Owner owner() {
        return  ownerService.findOne();
    }
}
