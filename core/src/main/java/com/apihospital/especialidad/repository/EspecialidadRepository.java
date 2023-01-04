package com.apihospital.especialidad.repository;

import com.apihospital.especialidad.model.Especialidad;

import java.util.List;

public interface EspecialidadRepository {

    void guardarEspecialidades(List<Especialidad> especialidades);

}
