package com.apihospital.adapters;

import com.apihospital.ports.UsuarioPort;
import com.apihospital.usuario.repository.UsuarioRepository;
import com.apihospital.usuario.requests.UsuarioRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UsuarioAdapter implements UsuarioPort {

    private final UsuarioRepository usuarioRepository;

    @Override
    public void registrarUsuario(UsuarioRequest request) {
        if(!usuarioRepository.usuarioExiste(request.getCedula())) {
            this.usuarioRepository.registrarUsuario(request);
        } else {
            throw new IllegalArgumentException(
                    "El usuario con cedula: " + request.getCedula()
                    + " ya existe."
            );
        }
    }
}
