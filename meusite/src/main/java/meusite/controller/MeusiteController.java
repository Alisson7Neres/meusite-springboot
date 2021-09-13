package meusite.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/contato")
public class MeusiteController {

		
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String home() {
		return "Hello World!";
	}

}
