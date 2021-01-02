package com.baraabytes.AnimalClinicData.service.map;

import com.baraabytes.AnimalClinicData.entity.BaseEntity;
import org.springframework.lang.NonNull;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity,ID>{
    protected Map<ID,T> map = new HashMap<>();
    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return  map.get(id);
    }
    T save(@NonNull T obj){
        ID id = (ID) obj.getId();
        this.map.put(id,obj);
        return  obj;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T obj){
        map.entrySet().removeIf(x -> x.getValue().equals(obj));
    }

}
