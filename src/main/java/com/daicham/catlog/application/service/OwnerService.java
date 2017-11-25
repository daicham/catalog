package com.daicham.catlog.application.service;

import com.daicham.catlog.domain.model.owner.Name;
import com.daicham.catlog.domain.model.owner.Owner;
import com.daicham.catlog.domain.model.owner.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author daicham
 */
@Service
public class OwnerService {

    @Autowired
    OwnerRepository ownerRepository;

    //TODO: rename to better one
    public Owner buildOwner(Name name) {
        return ownerRepository.findByName(name);
    }
}
