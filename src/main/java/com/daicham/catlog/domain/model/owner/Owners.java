package com.daicham.catlog.domain.model.owner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author daicham
 */
public class Owners {
    List<Owner> value = new ArrayList<>();

    public Owners(Owner... owners) {
        value.addAll(Arrays.asList(owners));
    }

    public void add(Owner owner) {
        value.add(owner);
    }
}
