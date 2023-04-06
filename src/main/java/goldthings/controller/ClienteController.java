package goldthings.controller;

import goldthings.models.Cliente;
import goldthings.models.Funcionario;
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
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/cliente-save")
    public String create(@ModelAttribute("funcionario") Cliente cliente, Model model) {
        clienteRepository.save(cliente);
        return "redirect:/cliente";
    }

    @GetMapping("/cliente")
    public String form(Model model) {
        List<Cliente> clienteList = clienteRepository.findAll();
        model.addAttribute("dados", clienteList);
        model.addAttribute("cliente", new Cliente());
        return "cliente";
    }

    @PostMapping("/cliente/{id}/excluir")
    public String excluir(@PathVariable Long id) {
        clienteRepository.deleteById(id);
        return "redirect:/cliente";
    }
}
