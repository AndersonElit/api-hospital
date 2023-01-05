package com.apihospital.cita.repository;

import com.apihospital.cita.model.Cita;
import com.apihospital.cita.requests.CitaRequest;

public interface CitaRepository {

    Cita agendarCita(CitaRequest request);

    Boolean usuarioCitaExiste(String cedula);

}
