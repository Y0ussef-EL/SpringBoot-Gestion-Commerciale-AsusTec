package com.asustec.gestion_commercial.repository;

import com.asustec.gestion_commercial.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    public Produit getProduitByIdPdt(Long idPdt);
}
