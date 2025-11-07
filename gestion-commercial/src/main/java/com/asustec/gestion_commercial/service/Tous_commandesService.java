package com.asustec.gestion_commercial.service;


import com.asustec.gestion_commercial.model.Tous_commandes;
import com.asustec.gestion_commercial.repository.Tous_commandesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Tous_commandesService {
    @Autowired
    Tous_commandesRepository tous_commandesRepository;

    public Tous_commandes addCommande(Tous_commandes new_commandes) {
        return tous_commandesRepository.save(new_commandes);
    }

}
