package com.apihospital.adapters;

import com.apihospital.cita.model.Cita;
import com.apihospital.cita.repository.CitaRepository;
import com.apihospital.cita.requests.CitaRequest;
import com.apihospital.cita.responses.CitaResponse;
import com.apihospital.ports.CitaPort;
import lombok.AllArgsConstructor;
import java.time.LocalDate;
import static com.apihospital.utils.operations.CalculoFechas.calcularFechaAgendamiento;

@AllArgsConstructor
public class CitaAdapter implements CitaPort {

    private final CitaRepository citaRepository;

    @Override
    public CitaResponse agendarCita(CitaRequest request) {

        if(
                citaRepository.usuarioCitaExiste(request
                        .getUsuario().getCedula()) &&
                request.getUsuario().getTipoUsuario()
                        .getTipo().equals("PARTICULAR")
        ) {
            return CitaResponse.builder()
                    .mensaje(
                    "El usuario con identificacion " +
                    request.getUsuario().getCedula() +
                    " ya tiene una cita agendada, " +
                    "por lo cual no podra realizar mas agendamientos."
                    )
                    .build();
        } else {
            LocalDate fechaCita = calcularFechaAgendamiento
                    (request.getUsuario().getTipoUsuario().getTipo());
            if(fechaCita.compareTo(LocalDate.now()) > 0) {
                request.setFechaCita(fechaCita);
                Cita cita = citaRepository.agendarCita(request);
                return CitaResponse.builder()
                        .id(cita.getId())
                        .fechaCita(cita.getFechaCita())
                        .mensaje("Cita creada de fora exitosa.")
                        .build();
            } else {
                return CitaResponse.builder()
                        .mensaje(
                        "Tipo de usuario no permitido en el hospital."
                        )
                        .build();
            }
        }

    }

}
