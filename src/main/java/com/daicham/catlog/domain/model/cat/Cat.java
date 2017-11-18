package com.daicham.catlog.domain.model.cat;

/**
 * @author daicham
 */
public class Cat {
    Name name = new Name();
    DateOfBirth dateOfBirth = new DateOfBirth();

    public Cat() {
    }

    public Cat(String name) {
        this.name = new Name(name);
    }
}
