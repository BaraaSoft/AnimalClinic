package com.baraabytes.AnimalClinicData.service;

import com.baraabytes.AnimalClinicData.entity.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
