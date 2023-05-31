package com.clientes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.clientes.models.entity.Factura;
import com.clientes.models.entity.Producto;
import com.clientes.models.services.IClienteService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class FacturaController {
	@Autowired
	private IClienteService clienteService;
	
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@GetMapping("/facturas/{id}")
	@ResponseStatus(code=HttpStatus.OK)
	public Factura mostrar(@PathVariable Integer id) {
		return clienteService.findFacturaById(id);
	}
	
	@Secured({"ROLE_ADMIN"})
	@DeleteMapping("/facturas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		clienteService.deleteFacturaById(id);
	}
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/facturas/busca-prod/{term}")
	@ResponseStatus(code=HttpStatus.OK)
	public List<Producto> buscaProducto(@PathVariable String term){
		return clienteService.findProductoByNombre(term);
	}
	
	@Secured({"ROLE_ADMIN"})
	@PostMapping("/facturas")
	@ResponseStatus(code=HttpStatus.CREATED)
	public Factura crear(@RequestBody Factura factura) {
		return clienteService.saveFactura(factura);
	}

}
