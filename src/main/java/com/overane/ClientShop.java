package com.overane;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class ClientShop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String password;
    @OneToOne
    private Cart cart;
    @Column(nullable = false, unique = true)
    @NotNull
    private String email;

    public ClientShop(Long id, String firstName, String lastName,String password, Cart cart) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.cart = cart;
        this.email=email;

    }

    public ClientShop(){

    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getPassword() {
        return password;
    }

    public Cart getCart() {
        return cart;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;


    }

}

