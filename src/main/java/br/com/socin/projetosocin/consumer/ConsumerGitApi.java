package br.com.socin.projetosocin.consumer;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerGitApi {

	public String carregarUsuarios() {
		String u = "https://api.github.com/users/torvalds/followers";
		String v = "https://api.github.com/search/users?q=repos:followers:>2000&language:java&page=1&per_page=500";
		RestTemplate rest = new RestTemplate();

		return rest.getForObject(v, String.class);
	}

}
