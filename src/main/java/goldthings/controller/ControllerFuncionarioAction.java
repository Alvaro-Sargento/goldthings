package goldthings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerFuncionarioAction {

	@GetMapping("/funcionario-action")
	public String home() {
		return "/funcionario-action";
	}
}
