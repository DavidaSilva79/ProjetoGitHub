package br.com.socin.projetosocin.controller;



import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.socin.projetosocin.repository.teste;
import br.com.socin.projetosocin.util.Converter;
import br.com.socin.projetosocin.util.Item;
import br.com.socin.projetosocin.util.Welcome;



@Controller
@RequestMapping("/home") 
public class HomeController {
	@Autowired
	private WebClient webClient;
	
	@Autowired
	private teste te;
	
	@GetMapping
	public String home(Model model) throws IOException {
		
	RestTemplate t = new RestTemplate();
	//https://api.github.com/users/torvalds/followers
	//t.getForEntity(url, responseType)
	
	// private static final String URI = "http://api.externa.com/servico";
	   String u = "https://api.github.com/users/torvalds/followers";
	   
	        RestTemplate rest = new RestTemplate();
	        String retorno = rest.getForObject(u, String.class);
	        //System.out.println(retorno);
	        
	        System.out.println("hello worldddddduuuuuDaviiii");

	  
	    //git[] testando = te.testando();
	        
	       /* ListaGit testando = te.testando();
	        
	        List<git> lista = testando.getLista();
	        
	        System.out.println(lista.size());*/
	        System.out.println(te.testando());
	        Welcome data = Converter.fromJsonString(te.testando());
	        
	        
	        List<Item> items = data.getItems();
	        int i =0;
	      for (Item item : items) {
	    	  i ++;
	    	
			System.out.println(item.getAvatarURL());
		}
	      
	       
	    
//	    for (git git : testando) {
//	    	System.out.println("xxxxxx");
//	    	System.out.println(git.getLogin());
//		}
	
	//System.out.println(te.testando());
		
		
		
		model.addAttribute("Usuarios",items);
		  
		
		

		return"home" ;
	}
	
	
	

}
