package com.daicham.catlog.domain.model.owner;

import org.springframework.util.StringUtils;

/**
 * @author daicham
 */
public class Family {
    String value;
    Owners owners = new Owners();

    public Family() {
    }

    public Family(String value) {
        this.value = value;
    }

    public void add(Owner owner) {
        owners.add(owner);
    }

    public boolean isEmpty() {
        return StringUtils.isEmpty(value);
    }

    public String asText() {
        return value;
    }
}
