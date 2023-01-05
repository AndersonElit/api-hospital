package com.apihospital.usuario.requests;

import com.apihospital.tipousuario.model.TipoUsuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequest {
    private String cedula;
    private String nombre;
    private TipoUsuario tipoUsuario;
}
