package com.apihospital.controllers;

import com.apihospital.services.TipoUsuarioService;
import com.apihospital.tipousuario.model.TipoUsuario;
import com.apihospital.utils.response.Response;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/tipos-usuario")
@AllArgsConstructor
public class TipoUsuarioController {

    private final TipoUsuarioService tipoUsuarioService;

    @PostMapping("/guardar-todo")
    public ResponseEntity<Response> gardarTiposUsuario(@RequestBody List<TipoUsuario> tipoUsuarios) {
        Response response = Response.builder().build();
        try {
            this.tipoUsuarioService.guardarTipoUsuarios(tipoUsuarios);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
