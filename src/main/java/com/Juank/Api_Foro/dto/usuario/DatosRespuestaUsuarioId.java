package com.Juank.Api_Foro.dto.usuario;

import com.Juank.Api_Foro.modelo.Usuario;

public record DatosRespuestaUsuarioId(String nombre, String email, String clave, String tipo) {

    public DatosRespuestaUsuarioId(Usuario usuario) {
        this(usuario.getNombre(), usuario.getEmail(), usuario.getClave(), usuario.getTipo().toString());
    }
}
