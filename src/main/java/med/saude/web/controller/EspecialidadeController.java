package med.saude.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/especialidades")
public class EspecialidadeController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/especialidade/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/especialidade/lista";
	}
}