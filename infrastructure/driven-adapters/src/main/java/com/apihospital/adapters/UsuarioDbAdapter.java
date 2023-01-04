package com.apihospital.adapters;

import com.apihospital.dao.UsuarioDao;
import com.apihospital.entities.UsuarioEntity;
import com.apihospital.usuario.repository.UsuarioRepository;
import com.apihospital.usuario.requests.UsuarioRequest;
import com.apihospital.utils.mapper.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioDbAdapter implements UsuarioRepository {

    private final UsuarioDao usuarioDao;

    @Override
    public void registrarUsuario(UsuarioRequest request) {
        this.usuarioDao.save(Mapper.map(request, UsuarioEntity.class));
    }

    @Override
    public Boolean usuarioExiste(String cedula) {
        return usuarioDao.existsByCedula(cedula);
    }
}
