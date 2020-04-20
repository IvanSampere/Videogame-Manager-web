package com.example.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Mision;

@Repository
public interface MisionRepository extends CrudRepository<Mision, String> {

}
