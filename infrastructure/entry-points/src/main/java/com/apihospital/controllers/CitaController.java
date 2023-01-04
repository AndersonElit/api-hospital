package com.apihospital.controllers;

import com.apihospital.cita.requests.CitaRequest;
import com.apihospital.services.CitaService;
import com.apihospital.utils.response.Response;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/citas")
@AllArgsConstructor
public class CitaController {

    private final CitaService citaService;

    @PostMapping("/agendar")
    public ResponseEntity<Response> agendarCita(@RequestBody CitaRequest request) {
        Response response = Response.builder().build();
        try {
            this.citaService.agendarCita(request);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
