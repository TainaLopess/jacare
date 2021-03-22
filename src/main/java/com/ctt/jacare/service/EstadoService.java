package com.ctt.jacare.service;

import com.ctt.jacare.model.Estado;

import java.util.List;


public interface EstadoService {

    List<Estado> findAll();

    List<Estado> findAll(Estado estado);

    Estado findById(Long id);

    Estado create(Estado estado);

    Estado update(Estado estado);

    void delete(Estado estado);

    void deleteById(Long id);
}
