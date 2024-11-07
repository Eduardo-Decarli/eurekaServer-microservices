package io.github.decarli.msclientes.application;

import io.github.decarli.msclientes.domain.Cliente;
import io.github.decarli.msclientes.infra.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClienteService {

    private final ClientRepository repository;

    public ClienteService(ClientRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    public Optional<Cliente> getByCPF(String cpf) {
        return repository.findByCpf(cpf);
    }
}
