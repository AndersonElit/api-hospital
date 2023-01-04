package com.apihospital.services;

import com.apihospital.ports.UsuarioPort;
import com.apihospital.usuario.requests.UsuarioRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioPort usuarioPort;

    @Transactional(rollbackFor = { SQLException.class })
    public void registrarUsuario(UsuarioRequest request) {
        usuarioPort.registrarUsuario(request);
    }

}
