package com.daicham.catlog.domain.model.owner;

/**
 * @author daicham
 */
public class Name {
    String value;

    public Name() {
    }

    public Name(String value) {
        this.value = value;
    }

    public String asText() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
