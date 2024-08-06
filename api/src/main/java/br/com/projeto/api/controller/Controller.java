package br.com.projeto.api.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.Cliente;
import br.com.projeto.api.repository.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin(origins = "*")
public class Controller {

    @Autowired
    private Repository clienteRepository;
    
    @GetMapping("/listarClientes")
    public Iterable<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Cliente Cadastrar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PutMapping("/editar")
    public Cliente editar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    
    @DeleteMapping("/remover/{id}")
    public void remover(@PathVariable long id) {
        clienteRepository.deleteById(id);
    }
}
