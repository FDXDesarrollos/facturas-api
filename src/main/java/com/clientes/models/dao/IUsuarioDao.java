package com.clientes.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.clientes.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	public Usuario findByusername(String username);
	
	@Query("select u from Usuario u where u.username=?1")
	public Usuario buscaUsuario(String username);
}
