package com.apihospital.tipousuario.repository;

import com.apihospital.tipousuario.model.TipoUsuario;

import java.util.List;

public interface TipoUsuarioRepository {

    void guardarTipoUsuarios(List<TipoUsuario> tipoUsuarios);

}
