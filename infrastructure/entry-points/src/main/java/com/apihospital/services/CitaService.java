package com.apihospital.services;

import com.apihospital.cita.requests.CitaRequest;
import com.apihospital.cita.responses.CitaResponse;
import com.apihospital.cita.responses.DetalleCitaResponse;
import com.apihospital.ports.CitaPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
@AllArgsConstructor
public class CitaService {

    private final CitaPort citaPort;

    @Transactional(rollbackFor = { SQLException.class })
    public CitaResponse agendarCita(CitaRequest request) {
        return citaPort.agendarCita(request);
    }

    public DetalleCitaResponse consultarCita(Integer id) {
        return citaPort.consultarCita(id);
    }

}
