package com.Prestamos.Solucionreto3.controller;

import com.Prestamos.Solucionreto3.Entities.Reservas;
import com.Prestamos.Solucionreto3.service.ReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservas")
public class ReservasController {

    @Autowired
    private ReservasService reservasService;

    @GetMapping("/all")
    public List<Reservas> getAll(){
        return reservasService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservas save(@RequestBody  Reservas p){
        return reservasService.save(p);
    }
}