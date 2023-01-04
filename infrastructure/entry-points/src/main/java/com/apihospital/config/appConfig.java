package com.apihospital.config;

import com.apihospital.adapters.EspecialidadAdapter;
import com.apihospital.adapters.TipoUsuarioAdapter;
import com.apihospital.adapters.UsuarioAdapter;
import com.apihospital.especialidad.repository.EspecialidadRepository;
import com.apihospital.ports.EspecialidadPort;
import com.apihospital.ports.TipoUsuarioPort;
import com.apihospital.ports.UsuarioPort;
import com.apihospital.tipousuario.repository.TipoUsuarioRepository;
import com.apihospital.usuario.repository.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {

    @Bean
    public EspecialidadPort especialidadPort(EspecialidadRepository especialidadRepository) {
        return new EspecialidadAdapter(especialidadRepository);
    }

    @Bean
    public TipoUsuarioPort tipoUsuarioPort(TipoUsuarioRepository tipoUsuarioRepository) {
        return new TipoUsuarioAdapter(tipoUsuarioRepository);
    }

    @Bean
    public UsuarioPort usuarioPort(UsuarioRepository usuarioRepository) {
        return new UsuarioAdapter(usuarioRepository);
    }

}
