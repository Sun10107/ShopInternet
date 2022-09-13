package com.overane;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;



@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany
    private List<CartEntry> cartEntries = new ArrayList<>();
    @Column(nullable = false)
     private Double totalPrice;

    public Cart(Long id, List<CartEntry> cartEntries, Double totalPrice) {
        this.id = id;
        this.cartEntries = cartEntries;
        this.totalPrice = totalPrice;
    }
    public Cart() {
    }
    public Long getId() {
        return id;
    }

    public List<CartEntry> getCartEntries() {
        return cartEntries;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCartEntries(List<CartEntry> cartEntries) {
        this.cartEntries = cartEntries;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}







