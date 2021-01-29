package br.com.socin.projetosocin.repository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.socin.projetosocin.model.ListaGit;
import br.com.socin.projetosocin.model.git;

@Service
public class teste {
	
	public void testando() {
		String u = "https://api.github.com/users/torvalds/followers";
		   
        RestTemplate rest = new RestTemplate();
       // String retorno = rest.getForObject(u, String.class);
        ResponseEntity<git[]> retorno = rest.getForEntity(u, git[].class);
       // System.out.println(retorno);
        git[] body = retorno.getBody();
        for (git git : body) {
        	System.out.println(git.getLogin());
        	System.out.println();
		}
        
        //System.out.println("hello worldddddd");
     //System.out.println( retorno.getBody());
		
		//return retorno;
	}
	

}
