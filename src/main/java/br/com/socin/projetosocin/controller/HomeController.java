package br.com.socin.projetosocin.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.client.WebClient;
import br.com.socin.projetosocin.consumer.ConsumerGitApi;
import br.com.socin.projetosocin.model.GitUser;
import br.com.socin.projetosocin.util.Converter;
import br.com.socin.projetosocin.util.Util;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private WebClient webClient;

	@Autowired
	private ConsumerGitApi consumerGitApi;

	@GetMapping
	public String home(Model model) throws IOException {

		System.out.println(consumerGitApi.carregarUsuarios());
		
		Util data = Converter.fromJsonString(consumerGitApi.carregarUsuarios());

		List<GitUser> gitUsers = data.getItems();


		model.addAttribute("Usuarios", gitUsers);

		return "home";
	}

}
