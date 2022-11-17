package com.crm1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm1.entities.Lead;

public interface LeadRepository  extends JpaRepository<Lead, Long>{

}
