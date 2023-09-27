package br.com.victor.mocks;

import br.com.victor.mocks.generic.IGenericDAO;
import br.com.victor.domain.Venda;
import br.com.victor.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
