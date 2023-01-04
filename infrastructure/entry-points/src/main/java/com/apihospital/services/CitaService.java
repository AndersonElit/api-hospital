package com.apihospital.services;

import com.apihospital.cita.requests.CitaRequest;
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
    public void agendarCita(CitaRequest request) {
        this.citaPort.agendarCita(request);
    }

}
