package com.entity_relationships.one_to_one.repositories;


import com.entity_relationships.one_to_one.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
