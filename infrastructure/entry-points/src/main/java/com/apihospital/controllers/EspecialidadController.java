package com.apihospital.controllers;

import com.apihospital.especialidad.model.Especialidad;
import com.apihospital.services.EspecialidadService;
import com.apihospital.utils.response.Response;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/especialidades")
@AllArgsConstructor
public class EspecialidadController {

    private final EspecialidadService especialidadService;

    @PostMapping("/guardar-todo")
    public ResponseEntity<Response> gardarEspecialidades(@RequestBody List<Especialidad> especialidades) {
        Response response = Response.builder().build();
        try {
            this.especialidadService.guardarEspecialidades(especialidades);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

    }

}
