package com.daicham.catlog.domain.model.owner;

import com.daicham.catlog.domain.model.cat.Cat;

/**
 * @author daicham
 */
public class Owner {
    Name name;
    Family family;
    Cat cat;

    public Owner(Name name) {
        this.name = name;
        this.family = new Family();
        this.cat = new Cat();
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
