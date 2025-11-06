package com.asustec.gestion_commercial.controller;

import com.asustec.gestion_commercial.model.Produit;
import com.asustec.gestion_commercial.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/produits")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping("/allproduits")
    public List<Produit> getAllProduits() {
        return produitService.getAllProduits();
    }

    @GetMapping("/{id}")
    public Produit getProduitById(@PathVariable Long id){
        return produitService.getProduitById(id);
    }
}
