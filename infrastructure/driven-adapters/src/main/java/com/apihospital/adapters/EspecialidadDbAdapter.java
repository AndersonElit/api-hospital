package com.apihospital.adapters;

import com.apihospital.dao.EspecialidadDao;
import com.apihospital.entities.EspecialidadEntity;
import com.apihospital.especialidad.model.Especialidad;
import com.apihospital.especialidad.repository.EspecialidadRepository;
import com.apihospital.utils.mapper.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EspecialidadDbAdapter implements EspecialidadRepository {

    private final EspecialidadDao especialidadDao;

    @Override
    public void guardarEspecialidades(List<Especialidad> especialidades) {
        this.especialidadDao.saveAll(Mapper.mapAll(especialidades, EspecialidadEntity.class));
    }
}
