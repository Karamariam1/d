package com.universia.gestion_demande.controller;

import com.universia.gestion_demande.entities.Client;
import com.universia.gestion_demande.metier.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/uni")
public class ClientController {
    @Autowired
    IClientService clientService;

    @GetMapping("/client")
    public List<Client> getAllClientFromDb(){
        return this.clientService.getAllClient();
    }

    @GetMapping("/client/{id}")
    public Client getClientByIdFromdb(@PathVariable("id") Integer id) {
        return this.clientService.getClientById(id);
    }

    @PostMapping("/client")
    private Client addClientToDb(@RequestBody Client c) {

        return this.clientService.addClient(c);
    }

    @DeleteMapping("/client/{id}")
    public void deleteClientByIdFromDb(@PathVariable("id") Integer id) {
        this.clientService.deleteClient(id);
    }
}
