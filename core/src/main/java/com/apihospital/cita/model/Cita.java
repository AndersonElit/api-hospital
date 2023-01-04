package com.apihospital.cita.model;

import com.apihospital.especialidad.model.Especialidad;
import com.apihospital.tipousuario.model.TipoUsuario;
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
public class Cita {
    private Integer id;
    private LocalDate fechaCita;
    private Usuario usuario;
    private TipoUsuario tipoUsuario;
    private Especialidad especialidad;
}
