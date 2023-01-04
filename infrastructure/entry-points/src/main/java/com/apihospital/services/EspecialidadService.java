package com.apihospital.services;

import com.apihospital.especialidad.model.Especialidad;
import com.apihospital.ports.EspecialidadPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@AllArgsConstructor
public class EspecialidadService {

    private final EspecialidadPort especialidadPort;

    @Transactional(rollbackFor = { SQLException.class })
    public void guardarEspecialidades(List<Especialidad> especialidades) {
        this.especialidadPort.guardarEspecialidades(especialidades);
    }

}
