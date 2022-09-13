package com.overane;

import javax.persistence.Entity;

import javax.persistence.*;



@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String unit;
    @Column(nullable = false)
    private Integer quantity;
    @Column(nullable = false)
    private Double price;

    public Product(String name, String unit, Integer quantity, Double prace) {
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
        this.price = prace;
    }
    public Product(){

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setBarcode(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString(){
           return "id = " + id+
                   ", name= " + name +
                   " , unit = " + unit +
                   " , quantity =" + quantity+
                   " , prace = " + price;
    }


}
