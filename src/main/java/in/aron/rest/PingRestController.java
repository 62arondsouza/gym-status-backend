package in.aron.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class PingRestController {
	@GetMapping("/ping")
	public String getPing() {
		return "pong";
	}
	
}
