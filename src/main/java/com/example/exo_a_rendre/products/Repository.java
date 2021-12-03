package com.example.exo_a_rendre.products;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Produit, String> {
    Produit findByDescription(String desc);
}