package com.example.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Hability;

@Repository
public interface HabilityRepository extends CrudRepository<Hability, String>{

}
