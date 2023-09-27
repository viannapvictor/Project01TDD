package br.com.victor.services;

import br.com.victor.domain.Cliente;
import br.com.victor.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {
    Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
