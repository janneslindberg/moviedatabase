package my.moviedb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

	@RequestMapping(path = {"/"}, method = RequestMethod.GET)
	public String testOK() {
		return "OK";
	}
	
}
