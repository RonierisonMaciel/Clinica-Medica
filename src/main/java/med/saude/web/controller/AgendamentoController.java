package med.saude.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/agendamentos")
public class AgendamentoController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/agendamento/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/agendamento/lista";
	}
}