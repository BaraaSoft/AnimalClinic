package com.baraabytes.AnimalClinicData.service;

import com.baraabytes.AnimalClinicData.entity.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
