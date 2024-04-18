package co.develhope.springQuery;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*scrivi una applicazione web Spring Boot con:
NameController dove si mappa il parametro name per:
restituire il nome alla chiamata GET
restuiture il nome al contrario (es. da John a nhoJ, usando StringBuilder) alla chiamata POST

aggungi tutto il necessario per avere la protezione tramite CORS
testare le chiamate del API endpoint usando Postman
*/
@RestController
public class NameController {
	
	@PostMapping("/api")
	public ResponseEntity<String> putName(@RequestBody String name){
		return new ResponseEntity<>(name, HttpStatus.OK);
	}
	
	@GetMapping("/api")
	public ResponseEntity<String> getName(@RequestParam String name){
		StringBuilder str = new StringBuilder(name);
		String result = str.reverse().toString();
		return new ResponseEntity<>(result.toUpperCase(), HttpStatus.OK);
	}
	
}
