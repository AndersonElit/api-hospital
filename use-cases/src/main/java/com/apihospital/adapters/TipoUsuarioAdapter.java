package com.apihospital.adapters;

import com.apihospital.ports.TipoUsuarioPort;
import com.apihospital.tipousuario.model.TipoUsuario;
import com.apihospital.tipousuario.repository.TipoUsuarioRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class TipoUsuarioAdapter implements TipoUsuarioPort {

    private final TipoUsuarioRepository tipoUsuarioRepository;

    @Override
    public void guardarTipoUsuarios(List<TipoUsuario> tipoUsuarios) {
        this.tipoUsuarioRepository.guardarTipoUsuarios(tipoUsuarios);
    }
}
