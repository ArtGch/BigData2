package com.example.exo_a_rendre.products;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/produit")
public class Service {
    private final Repository _ps;

    public Service(Repository Repository) {
        this._ps = Repository;
    }

    @GetMapping
    public Collection<Produit> get() {
        return _ps.findAll();
    }

    @GetMapping("/{description}")
    public Produit getByDescription(@PathVariable String description ) {
        return _ps.findByDescription(description);
    }

    @GetMapping("/count")
    public long countProduits() {
        return _ps.count();
    }

    @PostMapping("/{description}/{price}")
    public Produit add(@PathVariable String description, @PathVariable double price) {
        if(description.isEmpty()) return null; // on renvoit une erreur si pas de description
        return _ps.insert(new Produit(null, description, price)); // sinon on insert le produit
    }

    @DeleteMapping
    public void remove(@RequestBody Produit p) {
        _ps.delete(p);
    }
}