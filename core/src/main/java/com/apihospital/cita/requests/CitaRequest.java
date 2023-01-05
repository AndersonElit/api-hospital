package com.apihospital.cita.requests;

import com.apihospital.especialidad.model.Especialidad;
import com.apihospital.usuario.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CitaRequest {
    private LocalDate fechaCita;
    private Usuario usuario;
    private Especialidad especialidad;
}
