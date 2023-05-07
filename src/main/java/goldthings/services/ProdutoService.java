package goldthings.services;

import goldthings.models.Produto;
import goldthings.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
	
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
    public Produto findById(Long id) {
        Optional<Produto> produto = productRepository.findById(id);
        return produto.orElse(null);
    }


    
}
