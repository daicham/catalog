package com.daicham.catlog.domain.model.owner;

import com.daicham.catlog.domain.model.cat.Cat;

import java.util.Objects;

/**
 * @author daicham
 */
public class Owner {
    Name name = new Name();
    Family family = new Family();
    Cat cat = new Cat();

    public Owner(String givenName, String familyName) {
        this.name = new Name(givenName);
        this.family = new Family(familyName);
    }

    public Name getName() {
        return name;
    }

    public String asTextWithFamily() {
        return family.isEmpty() ?
                name.asText() :
                String.format("%s @ %s", name.asText(), family.asText());
    }
}
