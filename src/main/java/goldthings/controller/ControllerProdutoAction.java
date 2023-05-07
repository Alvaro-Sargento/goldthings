package goldthings.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import goldthings.models.Funcionario;

@Controller
public class ControllerProdutoAction {
	@GetMapping("/produto-action")
	public String home() {
		return "/produto-action";
	}
}
