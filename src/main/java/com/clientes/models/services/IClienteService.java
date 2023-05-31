package com.clientes.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.clientes.models.entity.Cliente;
import com.clientes.models.entity.Factura;
import com.clientes.models.entity.Producto;
import com.clientes.models.entity.Region;

public interface IClienteService {
	public List<Cliente> findAll();
	public Page<Cliente> findAll(Pageable pageable);
	public Cliente findById(Integer id);
	public Cliente save(Cliente cliente);
	public void delete(Integer id);
	public List<Region> findAllRegiones();
	
	public Factura findFacturaById(Integer id);
	public Factura saveFactura(Factura factura);
	public void deleteFacturaById(Integer id);
	
	public List<Producto> findProductoByNombre(String term);
}
