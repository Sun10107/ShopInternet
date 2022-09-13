package com.overane;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
    public interface CartRepositori extends CrudRepository <Cart, Long> {

    }
