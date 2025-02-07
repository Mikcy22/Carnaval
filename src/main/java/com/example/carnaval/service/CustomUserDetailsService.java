package com.example.carnaval.service;

import com.example.carnaval.model.Usuario;
import com.example.carnaval.repository.UsuarioRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    public CustomUserDetailsService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Buscar el usuario en la base de datos
        Usuario usuario = usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

        // Devolver un UserDetails con el nombre de usuario, la contraseña y los roles
        System.out.println(usuario.getRol());
        return User.builder()
                .username(usuario.getUsername())
                .password(usuario.getPassword())  // La contraseña debe estar cifrada
                .roles(usuario.getRol())  // Usar el valor del enum (ROLE_ADMIN o ROLE_USER)
                .build();
    }

}