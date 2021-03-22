package com.ctt.jacare.controller;

import com.ctt.jacare.service.VacinaService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacinaController {

    private final VacinaService vacinaService;

    public VacinaController(VacinaService vacinaService) {
        this.vacinaService = vacinaService;
    }
}
