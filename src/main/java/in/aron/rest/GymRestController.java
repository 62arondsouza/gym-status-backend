package in.aron.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aron.service.GymService;

@CrossOrigin(origins = "*")
@RestController
public class GymRestController {
	private GymService gymService;
	
	public GymRestController(GymService gymService) {
		this.gymService = gymService;
	}
	
	@GetMapping("/count")
	public int getMembersCount() {
		return gymService.getCount();
	}
	
	@PostMapping("/entry")
	public int increment() {
		gymService.entry();
		return gymService.getCount();
	}
	
	@PostMapping("/exit")
	public int decrement() {
		gymService.exit();
		return gymService.getCount();
	}
}
