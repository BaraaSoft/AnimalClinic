package com.baraabytes.AnimalClinicData.service;

import com.baraabytes.AnimalClinicData.entity.Owner;
import com.baraabytes.AnimalClinicData.entity.Vet;

import java.util.Set;

public interface OwnerService extends CrudService <Owner,Long>{
   Owner findByLastName(String lastname);
}
