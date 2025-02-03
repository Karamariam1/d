package com.universia.gestion_demande.controller;

import com.universia.gestion_demande.entities.Demande;
import com.universia.gestion_demande.metier.IDemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/uni")
public class DemandeController {
    @Autowired
    IDemandeService demandeService;
    @GetMapping("/demande")
    public List<Demande> getAllDemandeFromDb(){
        return this.demandeService.getAllDemandes();
    }
    @PostMapping("/demande")
    private Demande addDemandeToDb(@RequestBody Demande d) {

        return this.demandeService.addDemande(d);
    }
}
