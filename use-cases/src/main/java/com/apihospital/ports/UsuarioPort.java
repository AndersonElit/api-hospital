package com.apihospital.ports;

import com.apihospital.usuario.requests.UsuarioRequest;

public interface UsuarioPort {

    void registrarUsuario(UsuarioRequest request);

}
