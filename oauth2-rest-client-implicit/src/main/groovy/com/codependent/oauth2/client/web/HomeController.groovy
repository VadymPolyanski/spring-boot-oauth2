package com.codependent.oauth2.client.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.oauth2.client.OAuth2ClientContext
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {

	@Autowired
	private OAuth2ClientContext oauth2ClientContext
	
	@GetMapping("/home")
	void home(){
		
	}
	
}
