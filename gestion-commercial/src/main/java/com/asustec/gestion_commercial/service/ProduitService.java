package com.asustec.gestion_commercial.service;


import com.asustec.gestion_commercial.model.Produit;
import com.asustec.gestion_commercial.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    public Produit getProduitById(Long id) {
        Optional<Produit> produit = produitRepository.findById(id);
        if (produit.isPresent()) {
            return produit.get();
        } else {
            throw new RuntimeException("Produit non trouvé avec l'ID : " + id);
        }
    }
}
