package com.Juank.Api_Foro.modelo;


import com.Juank.Api_Foro.dto.usuario.DatosActualizarUsuario;
import com.Juank.Api_Foro.dto.usuario.DatosRegistroUsuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String clave;
    @Enumerated(EnumType.STRING)
    private Tipo tipo = Tipo.ROLE_USER;

    public Usuario(DatosRegistroUsuario datos) {
        this.nombre = datos.nombre();
        this.email = datos.email();
        this.clave = datos.clave();
        if (datos.tipo() != this.tipo) {
            this.tipo = datos.tipo();
        }
    }

    public void actualizarDatos(DatosActualizarUsuario datosActualizar) {
        if (datosActualizar.nombre() != null) {
            this.nombre = datosActualizar.nombre();
        }
        if (datosActualizar.email() != null) {
            this.email = datosActualizar.email();
        }
        if (datosActualizar.clave() != null) {
            this.clave = datosActualizar.clave();
        }
        if (datosActualizar.tipo() != datosActualizar.tipo()) {
            this.tipo = datosActualizar.tipo();
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(tipo.toString()));
    }

    @Override
    public String getPassword() {
        return clave;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
