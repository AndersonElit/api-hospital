package com.apihospital.adapters;

import com.apihospital.cita.model.Cita;
import com.apihospital.cita.repository.CitaRepository;
import com.apihospital.cita.requests.CitaRequest;
import com.apihospital.dao.CitaDao;
import com.apihospital.entities.CitaEntity;
import com.apihospital.utils.mapper.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CitaDbAdapter implements CitaRepository {

    private final CitaDao citaDao;

    @Override
    public Cita agendarCita(CitaRequest request) {
        return Mapper.map(
                citaDao.save(Mapper.map(request, CitaEntity.class)),
                Cita.class
        );
    }

    @Override
    public Boolean usuarioCitaExiste(String cedula) {
        return citaDao.existsByUsuario_Cedula(cedula);
    }

}
