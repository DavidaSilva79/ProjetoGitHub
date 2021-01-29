package br.com.socin.projetosocin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.socin.projetosocin.model.RequisicaoNovoUsuario;

@Controller
public class HelloController {
	
	@GetMapping("/hello") 	
	public String hello(Model model,RequisicaoNovoUsuario req) {
		model.addAttribute("nome"," Mundo");
		return "hello";
	}
	@PostMapping("/ddd") 	
	 public String ddd() {
			
	       System.out.println("hello world");
			
			return "redirect:/cadastro/hello";
			
	
		}

}
