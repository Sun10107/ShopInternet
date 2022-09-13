package com.overane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomClientDetailsService implements UserDetailsService {
    @Autowired
    private ClientShopRepository clientShopRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ClientShop client = clientShopRepository.findByEmail(username);
        if (client == null){
            throw new UsernameNotFoundException("Client not found");
        }
        return new CustomClientDetails(client);
    }
}

