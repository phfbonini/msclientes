package io.github.phfbonini.msclientes.application;

import io.github.phfbonini.msclientes.domain.Cliente;
import io.github.phfbonini.msclientes.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService  {

    private final ClienteRepository repository;


    @Transactional
    public Cliente save(Cliente cliente){
        return repository.save(cliente);
    }

    public Optional<Cliente> findByCPF(String cpf) {
        return repository.findByCpf(cpf);
    }
}
