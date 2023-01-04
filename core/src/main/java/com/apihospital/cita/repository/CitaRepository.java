package com.apihospital.cita.repository;

import com.apihospital.cita.requests.CitaRequest;

public interface CitaRepository {

    void agendarCita(CitaRequest request);

}
