package com.demo.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.practice.model.Pet;

public interface PetRepository extends JpaRepository<Pet, String> {

}
