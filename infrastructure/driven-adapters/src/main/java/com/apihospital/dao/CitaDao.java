package com.apihospital.dao;

import com.apihospital.entities.CitaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaDao extends JpaRepository<CitaEntity, Integer> {
}
