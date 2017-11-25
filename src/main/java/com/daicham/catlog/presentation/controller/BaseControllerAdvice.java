package com.daicham.catlog.presentation.controller;

import com.daicham.catlog.application.service.OwnerService;
import com.daicham.catlog.domain.model.owner.Name;
import com.daicham.catlog.domain.model.owner.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.security.Principal;
import java.util.HashMap;
import java.util.Objects;

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
    public Owner owner(Principal principal) {
        if(isAuthenticated(principal)) {
            OAuth2Authentication auth = (OAuth2Authentication) principal;
            HashMap<String, String> details = (HashMap<String, String>) auth.getUserAuthentication().getDetails();
            return  ownerService.buildOwner(new Name(details.get("name")));
        }
        return null;
    }

    private boolean isAuthenticated(Principal principal) {
        return Objects.nonNull(principal);
    }
}
