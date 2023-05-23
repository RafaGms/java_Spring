package com.fatec.client.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.client.entities.Client;

@RestController

public class ClientController {
    @GetMapping("client")
    public Client getClient() {
        Client c = new Client();
        c.setId(1);
        c.setEmail("joao@gmail.com");
        c.setName("joão");
        
        return c;
    }

    @GetMapping("clients")
    public String getClients() {
        return "id: 1, name: Maria, email: maria@gmail.com\n\n" +
                " id: 2, name: rafael, email: rafael@gmial.com";
    }
}
