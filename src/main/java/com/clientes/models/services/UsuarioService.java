package com.clientes.models.services;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clientes.models.dao.IUsuarioDao;
import com.clientes.models.entity.Usuario;

@Service
public class UsuarioService implements IUsuarioService, UserDetailsService{
	private final Logger log = LoggerFactory.getLogger(UsuarioService.class);
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.buscaUsuario(username);
		
		if(usuario == null) {
			String msg = "Usuario '" + username + "' no existe en el sistema";
			log.error(msg);
			throw new UsernameNotFoundException(msg);
		}
		
		List<GrantedAuthority> authorities = usuario.getPerfiles()
				 .stream()
				 .map(perfil -> new SimpleGrantedAuthority(perfil.getPerfil()))
				 .peek(authority -> log.info("Role: " + authority.getAuthority()))
				 .collect(Collectors.toList());
		
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true, authorities); 
	}

	@Override
	public Usuario findByusername(String username) {
		return usuarioDao.findByusername (username);
	}

}
