package com.universia.gestion_demande.metier;

import com.universia.gestion_demande.dao.DemandeDao;
import com.universia.gestion_demande.entities.Demande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DemandeServiceImpl implements IDemandeService{
    @Autowired
    DemandeDao demandeDao;
    @Override
    public Demande addDemande(Demande d) {
        return this.demandeDao.save(d);
    }

    @Override
    public Demande getDemandeById(Integer id) {
        return this.demandeDao.findById(id).orElse(null);
    }

    @Override
    public List<Demande> getAllDemandes() {
        return this.demandeDao.findAll();
    }

    @Override
    public List<Demande> getDemandesByType(String type) {
        return this.demandeDao.findByTypeContaining(type);
    }
}
