package com.daicham.catlog.infrastructure;

import com.daicham.catlog.domain.model.owner.Name;
import com.daicham.catlog.domain.model.owner.Owner;
import com.daicham.catlog.domain.model.owner.OwnerRepository;
import org.springframework.stereotype.Repository;

/**
 * @author daicham
 */
@Repository
public class OwnerDataSource implements OwnerRepository {
    @Override
    public Owner findByName(Name name) {
        return new Owner(name);
    }
}
