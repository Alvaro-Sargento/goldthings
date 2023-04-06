package goldthings.controller;

import goldthings.models.Funcionario;
import goldthings.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FuncionarioController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@PostMapping("/funcionario-save")
	public String create(@ModelAttribute("funcionario") Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
		return "redirect:/funcionario";
	}

	@GetMapping("/funcionario")
	public String form(Model model) {
		List<Funcionario> funcionarioList = funcionarioRepository.findAll();
		model.addAttribute("funcionario", new Funcionario());
		model.addAttribute("dados", funcionarioList);
		return "funcionario";
	}


	@PostMapping("/funcionario/{id}/excluir")
	public String excluir(@PathVariable Long id) {
		funcionarioRepository.deleteById(id);
		return "redirect:/funcionario";
	}

}