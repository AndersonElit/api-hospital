package com.apihospital.controllers;

import com.apihospital.cita.requests.CitaRequest;
import com.apihospital.cita.responses.CitaAgendadaResponse;
import com.apihospital.cita.responses.CitaResponse;
import com.apihospital.services.CitaService;
import com.apihospital.utils.response.Response;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("api/v1/citas")
@AllArgsConstructor
public class CitaController {

    private final CitaService citaService;

    @PostMapping("/agendar")
    public ResponseEntity<Response> agendarCita(@RequestBody CitaRequest request) {
        Response response = Response.builder().build();
        try {
            CitaResponse citaResponse = citaService.agendarCita(request);
            if(Objects.nonNull(citaResponse.getId())) {
                response.setResponse(CitaAgendadaResponse
                        .builder()
                        .id(citaResponse.getId())
                        .fechaCita(citaResponse.getFechaCita())
                        .build());
                response.setMensaje(citaResponse.getMensaje());
                return ResponseEntity.status(HttpStatus.OK).body(response);
            } else {
                response.setMensaje(citaResponse.getMensaje());
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
