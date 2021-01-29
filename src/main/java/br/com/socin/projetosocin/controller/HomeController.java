package br.com.socin.projetosocin.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.socin.projetosocin.repository.teste;



@Controller
@RequestMapping("/home") 
public class HomeController {
	@Autowired
	private WebClient webClient;
	
	@Autowired
	private teste te;
	
	@GetMapping
	public String home(Model model) {
		
	RestTemplate t = new RestTemplate();
	//https://api.github.com/users/torvalds/followers
	//t.getForEntity(url, responseType)
	
	// private static final String URI = "http://api.externa.com/servico";
	   String u = "https://api.github.com/users/torvalds/followers";
	   
	        RestTemplate rest = new RestTemplate();
	        String retorno = rest.getForObject(u, String.class);
	        //System.out.println(retorno);
	        
	        System.out.println("hello worldddddduuuuuDaviiii");

	  
	    te.testando();
	
	//System.out.println(te.testando());
		
		
		
		
		  
		
		

		return"home" ;
	}
	
	
	

}
