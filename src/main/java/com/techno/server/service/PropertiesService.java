package com.techno.server.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TTDKOC
 *
 */
@RestController	
@RequestMapping("/api")
public class PropertiesService {

	@GetMapping("/pee")
	public String test() {
		return "test";
	}
}
