package com.hatala.jhdemo8json;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@JsonGetMapping("/")
	public String home() {
		return "View endpoints:\n" +
				"localhost:8080/v2/api-docs\n" +
				"\n" +
				"View Swagger UI:\n" +
				"localhost:8080/swagger-ui.html\n" +
				"\n" +
				"View Role\n" +
				"localhost:8080/workspaces/Role1\n" +
				"localhost:8080/workspaces/Role2\n" +
				"localhost:8080/workspaces/Role3\n" +
				"";
	}
}
