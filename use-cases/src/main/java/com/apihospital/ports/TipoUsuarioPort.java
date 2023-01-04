package com.apihospital.ports;

import com.apihospital.tipousuario.model.TipoUsuario;

import java.util.List;

public interface TipoUsuarioPort {
    void guardarTipoUsuarios(List<TipoUsuario> tipoUsuarios);
}
