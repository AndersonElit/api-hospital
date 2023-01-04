package com.apihospital.config;

import com.apihospital.adapters.EspecialidadAdapter;
import com.apihospital.especialidad.repository.EspecialidadRepository;
import com.apihospital.ports.EspecialidadPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {

    @Bean
    public EspecialidadPort especialidadPort(EspecialidadRepository especialidadRepository) {
        return new EspecialidadAdapter(especialidadRepository);
    }

}
