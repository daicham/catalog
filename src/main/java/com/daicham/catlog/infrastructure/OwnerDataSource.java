package com.daicham.catlog.infrastructure;

import com.daicham.catlog.domain.model.owner.Owner;
import com.daicham.catlog.domain.model.owner.OwnerRepository;
import org.springframework.stereotype.Repository;

/**
 * @author daicham
 */
@Repository
public class OwnerDataSource implements OwnerRepository {
    @Override
    public Owner findOne() {
        return new Owner("ほげほげ", "ふが");
    }
}
