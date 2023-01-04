package com.apihospital.controllers;

import com.apihospital.ports.UsuarioPort;
import com.apihospital.usuario.requests.UsuarioRequest;
import com.apihospital.utils.response.Response;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/usuarios")
@AllArgsConstructor
public class UsuarioController {

    private final UsuarioPort usuarioPort;

    @PostMapping("/registrar-usuario")
    public ResponseEntity<Response> registrarUsuario(@RequestBody UsuarioRequest request) {
        Response response = Response.builder().build();
        try {
            this.usuarioPort.registrarUsuario(request);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
