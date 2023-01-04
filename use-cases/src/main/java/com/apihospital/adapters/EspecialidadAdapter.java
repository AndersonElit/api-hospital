package com.apihospital.adapters;

import com.apihospital.especialidad.model.Especialidad;
import com.apihospital.especialidad.repository.EspecialidadRepository;
import com.apihospital.ports.EspecialidadPort;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class EspecialidadAdapter implements EspecialidadPort {

    private final EspecialidadRepository especialidadRepository;

    @Override
    public void guardarEspecialidades(List<Especialidad> especialidades) {
        this.especialidadRepository.guardarEspecialidades(especialidades);
    }

}
