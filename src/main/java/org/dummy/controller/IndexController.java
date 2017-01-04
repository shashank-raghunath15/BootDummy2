package org.dummy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/BootDummy/")
	public String index() {
		return "index";
	}
}
