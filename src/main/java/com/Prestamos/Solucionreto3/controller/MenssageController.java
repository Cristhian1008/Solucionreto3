package com.Prestamos.Solucionreto3.controller;

import com.Prestamos.Solucionreto3.Entities.Message;
import com.Prestamos.Solucionreto3.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class MenssageController {
        @Autowired
        private MessageService messageService;

        @GetMapping("/all")
        public List<Message> getMensajes(){
            return messageService.getAll();
        }

        @GetMapping("/{id}")
        public Optional<Message> getMensaje(@PathVariable("id") int id){
            return messageService.getMessage(id);
        }

        @PostMapping("/save")
        @ResponseStatus(HttpStatus.CREATED)
        public Message save(@RequestBody Message message){
            return messageService.save(message);
        }

        @PutMapping("/update")
        @ResponseStatus(HttpStatus.CREATED)
        public Message update(@RequestBody Message message){
            return messageService.update(message);
        }

        @DeleteMapping("/{id}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public boolean deleteMensaje(@PathVariable("id") int id){
            return messageService.deleteMessage(id);
        }

    }

