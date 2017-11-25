package com.daicham.catlog.domain.model.owner;

/**
 * @author daicham
 */
public interface OwnerRepository {
    Owner findByName(Name name);
}
