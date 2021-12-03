package com.example.exo_a_rendre.products;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "produit")
public class Produit implements Serializable {
    @Id
    private String id; // id auto-généré par mongodb
    @Field("description")
    private String description;
    @Field("price")
    private double price;

    public Produit() {}

    public Produit(String id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id: '" + id + '\'' +
                ", description: '" + description + '\'' +
                ", price: " + price +
                '}';
    }
}