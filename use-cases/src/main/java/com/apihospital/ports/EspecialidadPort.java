package com.apihospital.ports;

import com.apihospital.especialidad.model.Especialidad;

import java.util.List;

public interface EspecialidadPort {

    void guardarEspecialidades(List<Especialidad> especialidades);

}
