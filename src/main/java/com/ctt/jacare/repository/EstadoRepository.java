package com.ctt.jacare.repository;

import com.ctt.jacare.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Long>{

    List<Estado> findAll(Estado estado);
}
