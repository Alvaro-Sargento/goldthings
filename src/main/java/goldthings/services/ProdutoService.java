package goldthings.services;

import goldthings.models.Produto;
import goldthings.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    // FIXME fazer validacao de erros em caso nao salvar
    @Autowired
    private ProductRepository productRepository;

    public void saveAllProducs(Produto produto) {
        productRepository.save(produto);
    }

    public void deleteWithId(Long id) {
        productRepository.deleteById(id);
    }

    public List<Produto> findAllProducts() {
        List<Produto> produtos = productRepository.findAll();
        return produtos;
    }
}
