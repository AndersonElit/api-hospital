package com.apihospital.dao;

import com.apihospital.entities.TipoUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoUsuarioDao extends JpaRepository<TipoUsuarioEntity, Integer> {
}
