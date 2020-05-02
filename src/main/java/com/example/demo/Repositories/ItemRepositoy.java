package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Item;

@Repository
public interface ItemRepositoy extends CrudRepository<Item, Integer> {
	
	@Query(value="SELECT * FROM ITEM WHERE TYPE_ID='ARMOR'", nativeQuery = true)
	List<Item> findArmors();
	
	@Query(value="SELECT * FROM ITEM WHERE TYPE_ID='WEAP'", nativeQuery = true)
	List<Item> findWeapons();
	
	@Query(value="SELECT * FROM ITEM WHERE TYPE_ID='CONS'", nativeQuery = true)
	List<Item> findConsumables();
	
//	@Modifying
//	@Query(value="insert into item (id, name, value, type, grievance, weight, type_id) values (:id, :name, :value, 'ARMOR', :armor, :weight, 'ARMOR')", nativeQuery = true)
//	void insertArmor( @Param("id") int id, @Param("name") String name, @Param("value") int value, @Param("armor") int armor, @Param("weight") int weight );
//	
	
	Item findByName(String name);
	
	
}
