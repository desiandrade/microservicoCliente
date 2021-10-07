package br.com.mybank.cliente.cliente.controller;

import br.com.mybank.cliente.cliente.domain.Pessoa;
import br.com.mybank.cliente.cliente.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping("adicionar")
    public ResponseEntity<?> adicionarCliente(@RequestBody Pessoa pessoa, @RequestHeader(value = "Authorization", required = true) String token) {
      return clienteService.adicionarCliente(pessoa, token);
    }

    @GetMapping("listartodos")
    public ResponseEntity<?> listarTodos(@RequestHeader(value = "Authorization", required = true) String token) {
        return clienteService.listarTodos(token);
    }

    @PutMapping("atualizar")
    public ResponseEntity<?> atualizarPessoa(@RequestBody Pessoa pessoa, @RequestHeader(value = "Authorization", required = true) String token) {

        return clienteService.atualizarCliente(pessoa, token);
    }

    @DeleteMapping("remover")
    public ResponseEntity<?> removerPessoa(@RequestHeader(value = "Authorization", required = true) String token) {
        return clienteService.removerPessoa(token);
    }


    //TODO Fazer com que os microserviços consultem enviando o token
    @GetMapping("pesquisar/{id}")
    public Optional<Pessoa> listarPorId(@PathVariable Integer id) {
        return clienteService.listarPorIdUsuario(id);
    }
}
