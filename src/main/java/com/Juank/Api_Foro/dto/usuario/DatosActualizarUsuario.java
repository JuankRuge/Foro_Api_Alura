package com.Juank.Api_Foro.dto.usuario;

import com.Juank.Api_Foro.modelo.Tipo;

public record DatosActualizarUsuario(Long id, String nombre, String email, String clave, Tipo tipo) {
}
