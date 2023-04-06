package goldthings.controller;

import goldthings.repository.FuncionarioRepository;
import goldthings.models.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

	@Autowired
	private FuncionarioRepository funcionario;

	@GetMapping("/")
	public String home() {
		List<Funcionario> funcionarioList = funcionario.findAll();
		return "/home";
	}
}