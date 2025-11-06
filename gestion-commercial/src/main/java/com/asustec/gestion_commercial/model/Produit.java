package com.asustec.gestion_commercial.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Produits_Prix")
public class Produit {
    @Id
    @Column(name = "codePdt",unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPdt;

    @Column(name="nomPdt",length = 40,nullable = false)
    private String nomPdt;

    @Column(name = "descPdt",length = 1000,nullable = true)
    private String descPdt;

    @Column(name = "prixPdt",nullable = false )
    private Double prixPdt;

    public Produit() {}

    public Produit(String nomPdt, String descPdt, Double prixPdt) {
        this.nomPdt = nomPdt;
        this.descPdt = descPdt;
        this.prixPdt = prixPdt;
    }

    public Long getIdPdt() {
        return idPdt;
    }

    public void setIdPdt(Long idPdt) {
        this.idPdt = idPdt;
    }

    public String getNomPdt() {
        return nomPdt;
    }

    public void setNomPdt(String nomPdt) {
        this.nomPdt = nomPdt;
    }

    public String getDescPdt() {
        return descPdt;
    }

    public void setDescPdt(String descPdt) {
        this.descPdt = descPdt;
    }

    public Double getPrixPdt() {
        return prixPdt;
    }

    public void setPrixPdt(Double prixPdt) {
        this.prixPdt = prixPdt;
    }

}
