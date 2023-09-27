package br.com.victor.services;

import br.com.victor.mocks.IProdutoDAO;
import br.com.victor.domain.Produto;
import br.com.victor.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
