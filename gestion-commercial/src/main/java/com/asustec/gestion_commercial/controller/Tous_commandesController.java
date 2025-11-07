package com.asustec.gestion_commercial.controller;


import com.asustec.gestion_commercial.model.Tous_commandes;
import com.asustec.gestion_commercial.service.Tous_commandesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/tous_commandes")
public class Tous_commandesController {
    @Autowired
    private Tous_commandesService tous_commandesService;

    @PostMapping("/add_commande")
    public ResponseEntity<?> addCommande(@RequestBody Tous_commandes new_commande){
        try {
            tous_commandesService.addCommande(new_commande);
            return new ResponseEntity<>(new_commande, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>("Erreur: Impossible d'ajouter la commande: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
