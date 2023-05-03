package goldthings.controller;

import goldthings.models.Cliente;
import goldthings.models.Produto;
import goldthings.repository.ClienteRepository;
import goldthings.repository.ProductRepository;
import goldthings.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/produtos/")
public class ProductoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/produto-save")
    public String create(@ModelAttribute("produto") Produto produto) {
        produtoService.saveAllProducs(produto);
        return "redirect:/produtos/listar";
    }

    @GetMapping("/formulario")
    public String formulario(Model model) {
        List<Produto> produtoList = produtoService.findAllProducts();
        model.addAttribute("produto", new Produto());
        model.addAttribute("dados", produtoList);
        return "produto";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Produto> produtoList = produtoService.findAllProducts();
        System.out.println(produtoList);
        model.addAttribute("produto", new Produto());
        model.addAttribute("dados", produtoList);
        return "produto-action";
    }

    @PostMapping("/produto/{id}/excluir")
    public String excluir(@PathVariable Long id) {
        System.out.println(id);
        produtoService.deleteWithId(id);
        return "redirect:/produtos/listar";
    }
}
