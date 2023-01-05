package com.apihospital.ports;

import com.apihospital.cita.requests.CitaRequest;
import com.apihospital.cita.responses.CitaResponse;
import com.apihospital.cita.responses.DetalleCitaResponse;

public interface CitaPort {

    CitaResponse agendarCita(CitaRequest request);

    DetalleCitaResponse consultarCita(Integer id);

}
