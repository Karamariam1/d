package com.universia.gestion_demande.metier;

import com.universia.gestion_demande.dao.ClientDao;
import com.universia.gestion_demande.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImpl implements IClientService{
    @Autowired
    private ClientDao clientDao;
    @Override
    public Client addClient(Client c) {
        return this.clientDao.save(c);
    }

    @Override
    public Client updateClient(Client c) {
        return this.clientDao.save(c);
    }


    @Override
    public Client getClientById(Integer id) {
        return this.clientDao.findById(id).orElse(null);
    }

    @Override
    public void deleteClient(Integer id) {
        this.clientDao.deleteById(id);
    }

    @Override
    public List<Client> getAllClient() {
        return this.clientDao.findAll();
    }
}
