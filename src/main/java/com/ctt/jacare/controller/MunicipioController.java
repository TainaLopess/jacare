package com.ctt.jacare.controller;

import com.ctt.jacare.service.MunicipioService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MunicipioController {

    private final MunicipioService municipioService;

    public MunicipioController(MunicipioService municipioService) {
        this.municipioService = municipioService;
    }
}
