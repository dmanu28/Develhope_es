package co.develhope.springQuery;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*Scrivi una applicazione web Spring Boot che alla endpoint 
 * GET v1/ciao?nome=Giuseppe&provincia=Lombardia risponde con 
 * "Ciao Giuseppe, com'è il tempo in Lombardia?"
 * 
 * Scrivi una applicazione web Spring Boot che alla endpoint 
 * GET v2/ciao/Lombardia?nome=Giuseppe risponde con un oggetto JSON*/
@RestController
@RequestMapping("v1")
public class Controller {
	
	@GetMapping("/ciao")
	public ResponseEntity<String> greetPerson(@RequestParam String name, @RequestParam String province){
		String greeting = "Ciao "+ name+ ", com'e il tempo in "+province;
		return new ResponseEntity<>(greeting, HttpStatus.OK);
	}
	
	@GetMapping("/hello")
	public Person showPerson(@RequestParam String name, @RequestParam String province){
		return new Person(name, province);
	}
}
