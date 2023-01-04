package com.apihospital.ports;

import com.apihospital.cita.requests.CitaRequest;

public interface CitaPort {

    void agendarCita(CitaRequest request);

}
