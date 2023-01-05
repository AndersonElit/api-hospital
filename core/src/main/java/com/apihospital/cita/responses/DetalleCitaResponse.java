package com.apihospital.cita.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetalleCitaResponse {

    private Integer id;
    private String especialidad;
    private String identificacionUsuario;
    private String tipoUsuario;
    private LocalDate fechaCita;

}
