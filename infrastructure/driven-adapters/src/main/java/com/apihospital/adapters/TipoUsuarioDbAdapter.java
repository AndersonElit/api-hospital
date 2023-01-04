package com.apihospital.adapters;

import com.apihospital.dao.TipoUsuarioDao;
import com.apihospital.entities.TipoUsuarioEntity;
import com.apihospital.tipousuario.model.TipoUsuario;
import com.apihospital.tipousuario.repository.TipoUsuarioRepository;
import com.apihospital.utils.mapper.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TipoUsuarioDbAdapter implements TipoUsuarioRepository {

    private final TipoUsuarioDao tipoUsuarioDao;

    @Override
    public void guardarTipoUsuarios(List<TipoUsuario> tipoUsuarios) {
        this.tipoUsuarioDao.saveAll(Mapper.mapAll(tipoUsuarios, TipoUsuarioEntity.class));
    }
}
