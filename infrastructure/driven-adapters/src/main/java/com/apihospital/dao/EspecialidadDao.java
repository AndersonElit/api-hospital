package com.apihospital.dao;

import com.apihospital.entities.EspecialidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadDao extends JpaRepository<EspecialidadEntity, Integer> {
}
