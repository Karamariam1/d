package com.universia.gestion_demande.metier;

import com.universia.gestion_demande.entities.Demande;

import java.util.List;

public interface IDemandeService {
    public Demande addDemande(Demande d);
    public Demande getDemandeById(Integer id);
    public List<Demande> getAllDemandes();
    public List<Demande> getDemandesByType(String type);
}
