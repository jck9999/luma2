package com.trabalho.crm.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
 
import com.trabalho.crm.model.Cliente;
import com.trabalho.crm.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins="http://localhost:8080")
public class ClienteControler {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@GetMapping
	public List<Cliente> ListarClientes() {
		return clienteRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente CadastrarCliente(@RequestBody Cliente cliente) {
	
		return clienteRepository.save(cliente);
		
	}
		
}

