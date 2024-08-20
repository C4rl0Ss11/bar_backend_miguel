package com.bar.demo.service;

import com.bar.demo.entity.Client;
import com.bar.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> getClients(){
        return  clientRepository.findAll();
    }

    public Optional<Client> getClient(Long id){
        return  clientRepository.findById(id);
    }
       public void saveOrUpdate(Client client){
    clientRepository.save(client);
}
       public void delete(Long id){
    clientRepository.deleteById(id);
}
    public void updateClient(Long clientId, Client client) {
        client.setId(clientId);
        clientRepository.save(client);
    }
}

