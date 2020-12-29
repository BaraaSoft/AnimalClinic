package com.baraabytes.AnimalClinicData.service;

import com.baraabytes.AnimalClinicData.entity.Owner;
import com.baraabytes.AnimalClinicData.entity.Vet;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner save(Owner vet);
    Set<Owner> findAll();
}
