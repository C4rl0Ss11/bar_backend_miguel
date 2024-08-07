package com.bar.demo.Controller;

import com.bar.demo.entity.Client;
import com.bar.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path= "api/v1/clients")

public class ClientController {


    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAll(){
        return clientService.getClients();
    }
    @GetMapping("/{clientId}")
    public Optional<Client> getById(@PathVariable("clientId")Long clientId){
        return clientService.getClient(clientId);
    }


    @PostMapping
    public Client saveUpdate(@RequestBody Client client){
        clientService.saveOrUpdate(client);
        return client;
    }
    @PutMapping("/{clientId}")
    public Client updateClient(@PathVariable("clientId") Long clientId, @RequestBody Client client) {
        // Aquí puedes verificar si el cliente existe antes de actualizarlo
        clientService.updateClient(clientId, client);
        return client;
    }
    @DeleteMapping("/{clientId}")
    public void saveUpdate(@PathVariable("clientId") Long clientId){
        clientService.delete(clientId);
    }

}
