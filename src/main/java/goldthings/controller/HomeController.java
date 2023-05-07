package goldthings.controller;

import goldthings.models.Produto;
import goldthings.repository.FuncionarioRepository;
import goldthings.models.Funcionario;
import goldthings.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

	@Autowired
	private FuncionarioRepository funcionario;

	@Autowired
	private ProdutoService produtoService;

	@GetMapping("/")
	public String home(Model model) {
		List<Funcionario> funcionarioList = funcionario.findAll();
		List<Produto> produtoList = produtoService.findAllProducts();
		System.out.println(produtoList);
		model.addAttribute("dados", produtoList);
		return "/home";
	}
}