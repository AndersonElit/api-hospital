package com.apihospital.adapters;

import com.apihospital.cita.repository.CitaRepository;
import com.apihospital.cita.requests.CitaRequest;
import com.apihospital.ports.CitaPort;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class CitaAdapter implements CitaPort {

    private final CitaRepository citaRepository;

    @Override
    public void agendarCita(CitaRequest request) {
        request.setFechaCita(LocalDate.now());
        this.citaRepository.agendarCita(request);
    }
}
