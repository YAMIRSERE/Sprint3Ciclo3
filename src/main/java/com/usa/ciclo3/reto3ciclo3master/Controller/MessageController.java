package com.usa.ciclo3.reto3ciclo3master.Controller;

import com.usa.ciclo3.reto3ciclo3master.entities.Category;
import com.usa.ciclo3.reto3ciclo3master.entities.Message;
import com.usa.ciclo3.reto3ciclo3master.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<Message> getAll(){
        return messageService.getAll();
    }

    @PostMapping("/save")
    public Message save(@RequestBody Message p){
        return messageService.save(p);
    }

}
