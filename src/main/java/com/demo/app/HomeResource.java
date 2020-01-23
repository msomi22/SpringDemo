/**
 * 
 */
package com.demo.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pmnjeru
 *
 */
@RestController
public class HomeResource {

	@GetMapping("/home")
	public String home() {
		return "<h1>home</h1>";
	}
	@GetMapping("/user")
	public String user() {
		return "<h1>user</h1>";
	}
	@GetMapping("/admin")
	public String admin() {
		return "<h1>admin</h1>";
	}

}
