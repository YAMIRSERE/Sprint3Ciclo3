package com.usa.ciclo3.reto3ciclo3master.Controller;

import com.usa.ciclo3.reto3ciclo3master.entities.Cabin;
import com.usa.ciclo3.reto3ciclo3master.service.CabinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Cabin")
public class CabinController {

    @Autowired
    private CabinService cabinService;

    @GetMapping("/all")
    public List<Cabin> getAll(){
        return cabinService.getAll();
    }

    @PostMapping("/save")
    public Cabin save(@RequestBody Cabin c){
        return cabinService.save(c);
    }
}
