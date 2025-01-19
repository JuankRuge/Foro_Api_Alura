package com.Juank.Api_Foro.dto.usuario;

import com.Juank.Api_Foro.modelo.Tipo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroUsuario(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String clave,
        @NotNull
        Tipo tipo) {
}
