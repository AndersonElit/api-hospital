package com.apihospital.usuario.repository;

import com.apihospital.usuario.requests.UsuarioRequest;

public interface UsuarioRepository {

    void registrarUsuario(UsuarioRequest request);

    Boolean usuarioExiste(String cedula);

}
