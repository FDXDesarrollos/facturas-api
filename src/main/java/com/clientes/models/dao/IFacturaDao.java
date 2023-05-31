package com.clientes.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.clientes.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Integer>{

}
