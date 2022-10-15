package com.usa.ciclo3.reto3ciclo3master.Controller;

import com.usa.ciclo3.reto3ciclo3master.entities.Category;
import com.usa.ciclo3.reto3ciclo3master.entities.Client;
import com.usa.ciclo3.reto3ciclo3master.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getAll(){
        return clientService.getAll();
    }

    @PostMapping("/save")
    public Client save(@RequestBody Client p){
        return clientService.save(p);
    }
}
