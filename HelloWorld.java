package com.example.hello1;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorld {
	
	@GetMapping(value = "/city")
	public ResponseEntity<String> greeting(HttpServletRequest req, HttpServletResponse res) {
	    // code that uses the language variable
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("Correlation-ID", "1234567890");
		HttpEntity entity = new HttpEntity(headers);

		req.getHeaders("COR-ID");
		restTemplate.exchange("http://localhost:8888/city", HttpMethod.GET, entity, String.class);

		
	    return new ResponseEntity<String>("city000", HttpStatus.OK);
	}

}
