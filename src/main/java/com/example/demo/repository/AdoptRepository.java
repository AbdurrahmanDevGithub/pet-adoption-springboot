package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.AdoptClass;

public interface AdoptRepository extends JpaRepository<AdoptClass,Integer>{
	@Query("SELECT a FROM AdoptClass a WHERE a.owner_id = :owner_id")
    List<AdoptClass> notificationsByOwner(int owner_id);
}
