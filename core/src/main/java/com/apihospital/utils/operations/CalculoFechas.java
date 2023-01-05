package com.apihospital.utils.operations;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalculoFechas {

    public static LocalDate calcularFechaAgendamiento(String tipoUsuario) {
        if(tipoUsuario.equals("EPS")) {
            return fechaSinFinesSemana(10);
        } else if (tipoUsuario.equals("POLIZA")) {
            return fechaConFinesSemana(8);
        } else if (tipoUsuario.equals("PARTICULAR")) {
            return fechaSinFinesSemana(7);
        } else {
            return LocalDate.now();
        }
    }

    private static LocalDate fechaConFinesSemana(Integer dias) {
        return LocalDate.now().plusDays(dias);
    }

    private static LocalDate fechaSinFinesSemana(Integer dias) {
        LocalDate fecha = LocalDate.now();
        Integer diasSuma = 0;
        while (diasSuma < dias) {
            fecha = fecha.plusDays(1);
            if(!(fecha.getDayOfWeek() == DayOfWeek.SATURDAY ||
                    fecha.getDayOfWeek() == DayOfWeek.SUNDAY)) {
                ++diasSuma;
            }
        }
        return fecha;
    }

}
