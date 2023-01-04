package com.apihospital.services;

import com.apihospital.ports.TipoUsuarioPort;
import com.apihospital.tipousuario.model.TipoUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@AllArgsConstructor
public class TipoUsuarioService {

    private final TipoUsuarioPort tipoUsuarioPort;

    @Transactional(rollbackFor = { SQLException.class })
    public void guardarTipoUsuarios(List<TipoUsuario> tipoUsuarios) {
        this.tipoUsuarioPort.guardarTipoUsuarios(tipoUsuarios);
    }

}
