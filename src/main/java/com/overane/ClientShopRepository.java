package com.overane;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientShopRepository extends CrudRepository <ClientShop, Long> {
    ClientShop findByEmail(String email);

}




