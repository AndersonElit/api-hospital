package com.apihospital.services;

import com.apihospital.especialidad.model.Especialidad;
import com.apihospital.ports.EspecialidadPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EspecialidadService {

    private final EspecialidadPort especialidadPort;

    public void guardarEspecialidades(List<Especialidad> especialidades) {
        this.especialidadPort.guardarEspecialidades(especialidades);
    }

}
