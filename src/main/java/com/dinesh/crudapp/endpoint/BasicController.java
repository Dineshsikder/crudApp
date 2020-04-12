/**
 * 
 */
package com.dinesh.crudapp.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dinesh
 *
 */
@RestController
public class BasicController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/hello/{name}")
	public String helloMessage(@PathVariable("name") String name) {
		return "Hello "+ name;
	}
}
