package com.example.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Item;

@Repository
public interface ItemRepositoy extends CrudRepository<Item, String> {

}
