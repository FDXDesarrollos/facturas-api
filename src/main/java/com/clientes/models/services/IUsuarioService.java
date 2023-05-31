package com.clientes.models.services;

import com.clientes.models.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByusername(String username);
}
