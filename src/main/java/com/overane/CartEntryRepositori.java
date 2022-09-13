package com.overane;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartEntryRepositori extends CrudRepository <CartEntry,Long>
{
    public void deleteCartEntryById (long id);
}

