package com.ctt.jacare.controller;

import com.ctt.jacare.model.Estado;
import com.ctt.jacare.service.EstadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/jacare/estados")
class EstadoController {


    private final EstadoService estadoService;

    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping
    public ResponseEntity <List<Estado>> FindAll (){
        return new ResponseEntity<>(this.estadoService.findAll(), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity <List<Estado>> FindAll (Estado estado){
        return new ResponseEntity<>(this.estadoService.findAll(estado), HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Estado> findById (@PathVariable Long Id) {
        return new ResponseEntity<>(this.estadoService.findById(Id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Estado> Create (@RequestBody Estado estado) {
        return new ResponseEntity<>(this.estadoService.create(estado), HttpStatus.CREATED);
    }


}
