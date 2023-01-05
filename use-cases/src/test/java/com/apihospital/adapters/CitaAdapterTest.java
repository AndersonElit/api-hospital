package com.apihospital.adapters;

import com.apihospital.cita.model.Cita;
import com.apihospital.cita.repository.CitaRepository;
import com.apihospital.cita.requests.CitaRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDate;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CitaAdapterTest {

    @InjectMocks
    CitaAdapter citaAdapter;

    @Mock
    CitaRepository citaRepository;

    Cita cita;


    @BeforeEach
    void setUp() {
        cita = Cita.builder()
                .fechaCita(LocalDate.now())
                .build();
    }

    @Test
    void agendarCita() {
        when(citaRepository.agendarCita(any(CitaRequest.class))).thenReturn(cita);
        Cita citaGuardada = citaRepository.agendarCita(CitaRequest.builder().build());
        assertThat(citaGuardada).isNotNull();
    }

    @Test
    void consultarCita() {
        when(citaRepository.consultarCita(any(Integer.class))).thenReturn(cita);
        Cita consultaCita = citaRepository.consultarCita(1);
        assertThat(consultaCita).isNotNull();
    }
}