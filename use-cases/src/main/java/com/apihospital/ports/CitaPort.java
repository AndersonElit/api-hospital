package com.apihospital.ports;

import com.apihospital.cita.requests.CitaRequest;
import com.apihospital.cita.responses.CitaResponse;

public interface CitaPort {

    CitaResponse agendarCita(CitaRequest request);

}
