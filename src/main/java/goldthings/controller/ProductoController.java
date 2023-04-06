package goldthings.controller;

import goldthings.models.Cliente;
import goldthings.models.Produto;
import goldthings.repository.ClienteRepository;
import goldthings.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductoController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/produto-save")
    public String create(@ModelAttribute("produto") Produto produto) {
        productRepository.save(produto);
        return "redirect:/produto";
    }

    @GetMapping("/produto")
    public String form(Model model) {
        List<Produto> produtoList = productRepository.findAll();
        model.addAttribute("produto", new Produto());
        model.addAttribute("dados", produtoList);
        return "produto";
    }

    @PostMapping("/produto/{id}/excluir")
    public String excluir(@PathVariable Long id) {
        productRepository.deleteById(id);
        return "redirect:/produto";
    }
}
