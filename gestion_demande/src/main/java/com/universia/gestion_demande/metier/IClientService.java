package com.universia.gestion_demande.metier;

import com.universia.gestion_demande.entities.Client;

import java.util.List;

public interface IClientService {
    public Client addClient(Client c);
    public Client updateClient(Client c);
    public Client getClientById(Integer id);
    public void deleteClient(Integer id);
    public List<Client> getAllClient();
}
